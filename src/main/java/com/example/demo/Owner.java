package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    String Name;
    List<Animal> pets = new ArrayList<>();

    public void addPet(Animal pet){
        pets.add(pet);
    }
}
