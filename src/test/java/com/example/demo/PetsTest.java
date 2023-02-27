package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PetsTest {
    Pets zoo = new Pets();

    @Test
    void isPalendrome(){
        Boolean result = zoo.isPalindrome("abba");
        assertEquals(true, result);
    }

    @Test
    void caseInsensitivePalendromes(){
        Boolean result = zoo.isPalindrome("Siris");
        assertEquals(true, result);
    }

    @Test
    void isNotPalendrome(){
        Boolean result = zoo.isPalindrome("Ronathin");
        assertEquals(false, result);
    }
    @Test
    void allPalindromes(){
        List<Animal> results = zoo.palindromes();
        assertEquals(2, results.size());
    }

    @Test
    void groupByOwner(){
        HashMap<String, List<Animal>> groups = zoo.groupByOwner();
        System.out.print(groups);
    }

}
