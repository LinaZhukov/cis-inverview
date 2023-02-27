package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PetsTest {
    Pets pets = new Pets();

    @Test
    void isPalendrome(){
        Boolean result = pets.isPalindrome("abba");
        assertEquals(true, result);
    }

    @Test
    void caseInsensitivePalendromes(){
        Boolean result = pets.isPalindrome("Siris");
        assertEquals(true, result);
    }

    @Test
    void isNotPalendrome(){
        Boolean result = pets.isPalindrome("Ronathin");
        assertEquals(false, result);
    }
    @Test
    void allPalindromes(){
        List<Animal> results = pets.palindromes();
        assertEquals(2, results.size());
    }

    @Test
    void groupByOwner(){
        HashMap<String, List<Animal>> groups = pets.groupByOwner();
        System.out.print(groups);
    }

}
