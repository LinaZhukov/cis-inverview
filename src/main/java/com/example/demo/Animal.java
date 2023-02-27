package com.example.demo;

import com.example.db.Model;

public class Animal {
    String AnimalName;
    String Species;
    String Age;
    String Owner;

    public Animal(String[] values){
        this.AnimalName = values[0];
        this.Species = values[1];
        this.Age = values[2];
        this.Owner = values[3];
    }

    @Override
    public String toString() {
        return this.AnimalName + " (" + this.Species + " - " + this.Age + ") : " + this.Owner;
    }
}
