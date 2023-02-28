package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void isPalendrome(){
        Boolean result = Animal.isPalindrome("abba");
        assertEquals(true, result);
    }

    @Test
    void caseInsensitivePalendromes(){
        Boolean result = Animal.isPalindrome("Siris");
        assertEquals(true, result);
    }

    @Test
    void isNotPalendrome(){
        Boolean result = Animal.isPalindrome("Ronathin");
        assertEquals(false, result);
    }
}
