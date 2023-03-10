package com.example.demo;

import com.example.db.*;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Park {
    db animals = new db();
    HashMap<String, Owner> visitors = new HashMap<>();

    void register(Animal a){
        if(!visitors.containsKey(a.Owner)){
            Owner owner = new Owner(a.Owner);
            visitors.put(a.Owner, owner);
        }

        Owner visitor = visitors.get(a.Owner);
        visitor.pets.add(a);
    }

    Park(){
        animals.query().forEach(this::register);
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

    /*
     * List the average age of the animals owned by each person,
     * alphabetically by the person’s name.
     * */
    public String[] ageByOwner(){
        String[] keys = visitors.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        String[] updated = Arrays
                .stream(keys)
                .map(i -> i + " - " + visitors.get(i).averagePetAge())
                .toList()
                .toArray(new String[0]);

        return updated;
    }

    /*
    * List the animals by age.
    * I.e., list all the animals with age 1, then age 2, etc.
    * */
    public Map<Integer, List<Animal>> ageGroups(){
        Map<Integer, List<Animal>> grouped = animals.query()
                .stream()
                .collect(groupingBy(Animal::Age));

        return grouped;
    }
}
