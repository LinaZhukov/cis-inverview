package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkTest {
    Park park = new Park();



    @Test
    void allPalindromes(){
        List<Animal> results = park.palindromes();
        assertEquals(2, results.size());
    }

    @Test
    void groupByOwner(){
        HashMap<String, List<Animal>> groups = park.groupByOwner();
        System.out.print(groups);
    }

}
