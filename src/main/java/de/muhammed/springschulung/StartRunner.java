package de.muhammed.springschulung;

import de.muhammed.springschulung.entity.Plant;
import de.muhammed.springschulung.entity.PlantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class StartRunner implements ApplicationRunner {

    private final PlantRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Plant gruen = new Plant();
        gruen.setName("Grün");

        Plant rot = new Plant();
        rot.setName("Rot");
        repository.save(gruen);
        someMethod();

    }

    void someMethod() {
        Collection<Plant> plants = repository.findAllBy(Plant.class);
        Collection<PlantDto> plantDtos = repository.findAllBy(PlantDto.class);
    }
}
