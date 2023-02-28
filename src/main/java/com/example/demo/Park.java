package com.example.demo;

import com.example.db.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Park {
    db animals = new db();
    HashMap<String, Owner> visitors = new HashMap<>();

    void register(Animal a){
        if(!visitors.containsKey(a.Owner)){
            Owner owner = new Owner();
            owner.Name = a.Owner;
            visitors.put(a.Owner, owner);
        }

        Owner visitor = visitors.get(a.Owner);
        visitor.pets.add(a);
    }

    Park(){
        for(Animal animal : animals.query()){
            this.register(animal);
        }
    }

    /*
    * You may have noticed that some of the animal names are palindromes.
    * Please list them in any order.
    * */
    public List<Animal> palindromes(){
        return animals.query()
                .stream()
                .filter(i -> Animal.isPalindrome(i.AnimalName))
                .collect(Collectors.toList());
    }



    public HashMap<String, List<Animal>> groupByOwner(){
        HashMap<String, List<Animal>> m = new HashMap<>();

        for(Animal i : animals.query()){
            if(!m.containsKey(i.Owner)){
                List<Animal> animals = new ArrayList<>();
                m.put(i.Owner, animals);
            }

            List<Animal> animals = m.get(i.Owner);
            animals.add(i);
            m.put(i.Owner, animals);
        }

        return m;
    }

    /*
     * List the average age of the animals owned by each person,
     * alphabetically by the person’s name.
     * */
    public void ageByOwner(){
        HashMap<String, List<Animal>> owners = groupByOwner();
    }
}
