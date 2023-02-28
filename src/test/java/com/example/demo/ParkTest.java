package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkTest {
    Park park = new Park();

    @Test
    void isPalendrome(){
        Boolean result = park.isPalindrome("abba");
        assertEquals(true, result);
    }

    @Test
    void caseInsensitivePalendromes(){
        Boolean result = park.isPalindrome("Siris");
        assertEquals(true, result);
    }

    @Test
    void isNotPalendrome(){
        Boolean result = park.isPalindrome("Ronathin");
        assertEquals(false, result);
    }

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
