package de.muhammed.graphql_kurs.controller;

import de.muhammed.graphql_kurs.entity.Person;
import de.muhammed.graphql_kurs.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GraphQLController {

    private final PersonRepository repository;

    @QueryMapping
    public Person person(@Argument int id) {
        return repository.findById((long) id)
                .orElse(null);

    }
    @QueryMapping
    public List<Person> persons(@Argument int count, @Argument int offset) {
        return repository.findAll()
                .stream()
                .skip(offset)
                .limit(count)
                .toList();
    }
}