package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkTest {
    Park park = new Park();

    @Test
    void register(){
        HashMap<String, Owner> groups = park.visitors;
        assertEquals(3, groups.get("Bobby").pets.size());
        System.out.print(groups);
    }

    /*
     * You may have noticed that some of the animal names are palindromes.
     * Please list them in any order.
     * */
    @Test
    void allPalindromes(){
        List<Animal> results = park.palindromes();
        results.forEach(System.out::println);
        assertEquals(2, results.size());
    }

    /*
     * List the average age of the animals owned by each person,
     * alphabetically by the person’s name.
     * */
    @Test
    void ageByOwner(){
        String[] results = park.ageByOwner();
        for (String result : results) {
            System.out.println(result);
        }
    }

    /*
     * List the animals by age.
     * I.e., list all the animals with age 1, then age 2, etc.
     * */
    @Test
    void ageGroups(){
        Map<Integer, List<Animal>> results = park.ageGroups();
        System.out.print(results);
    }

}
