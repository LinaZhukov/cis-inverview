package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    Owner owner = new Owner("Larry");

    @BeforeEach
    void setup(){
        Animal animal1 = new Animal(new String[]{"Tomathin", "Bear", "5", "Lina",});
        Animal animal2 = new Animal(new String[]{"Bernie", "Moose", "3", "Lina",});
        owner.addPet(animal1);
        owner.addPet(animal2);
    }


    @Test
    void addPet() {
        assertEquals(2, owner.pets.size());
    }

    @Test
    void averagePetAge() {
        int avg = owner.averagePetAge();
        assertEquals(4, avg);
    }
}
