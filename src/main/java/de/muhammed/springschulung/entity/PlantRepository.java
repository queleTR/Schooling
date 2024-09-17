package de.muhammed.springschulung.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    <T>Collection<T> findAllBy(Class<T> type);

}




