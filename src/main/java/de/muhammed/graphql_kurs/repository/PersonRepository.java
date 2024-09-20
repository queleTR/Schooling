package de.muhammed.graphql_kurs.repository;

import de.muhammed.graphql_kurs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
