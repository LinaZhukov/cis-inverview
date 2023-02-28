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

    @Test
    void allPalindromes(){
        List<Animal> results = park.palindromes();
        results.forEach(System.out::println);
        assertEquals(2, results.size());
    }

    @Test
    void ageByOwner(){
        String[] results = park.ageByOwner();
        for (String result : results) {
            System.out.println(result);
        }
    }

    @Test
    void ageGroups(){
        Map<Integer, List<Animal>> results = park.ageGroups();
        System.out.print(results);
    }

}
