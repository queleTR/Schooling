package de.muhammed.graphql_kurs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String vorname;
    private String nachname;

}
