package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    String Name;
    List<Animal> pets = new ArrayList<>();

    public Owner(String name){
        this.Name = name;
    }

    public Owner(){

    }

    public void addPet(Animal pet){
        pets.add(pet);
    }

    public Integer averagePetAge(){
        int ages = pets.stream().mapToInt(i -> i.Age).sum();
        int average = ages / pets.size();
        return average;
    }

    @Override
    public String toString() {
        return Name + ", pets: " + pets.size();
    }
}
