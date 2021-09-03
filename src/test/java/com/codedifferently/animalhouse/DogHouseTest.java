package com.codedifferently.animalhouse;

import org.junit.Test;
import com.codedifferently.animalhouse.animals.Dog;
import com.codedifferently.animalhouse.animals.animal_creation.AnimalFactory;
import com.codedifferently.animalhouse.animals.animal_storage.DogHouse;

import java.util.Date;

public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Bilbo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
