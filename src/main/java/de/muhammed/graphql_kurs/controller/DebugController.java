package de.muhammed.graphql_kurs.controller;

import de.muhammed.graphql_kurs.entity.Person;
import de.muhammed.graphql_kurs.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/debug")
@RequiredArgsConstructor
public class DebugController {

    public final PersonRepository personRepository;

    @GetMapping("/generate")
    public void generate() {
        for(int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setVorname("Vorname" + i);
            person.setNachname("Nachname" + i);
            personRepository.save(person);
        }
    }
}
