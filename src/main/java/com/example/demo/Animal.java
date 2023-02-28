package com.example.demo;

public class Animal {
    String AnimalName;
    String Species;
    Integer Age;
    String Owner;

    public Animal(String[] values) {
        this.AnimalName = values[0];
        this.Species = values[1];
        this.Age = Integer.parseInt(values[2]);
        this.Owner = values[3];
    }

    @Override
    public String toString() {
        return this.AnimalName + " (" + this.Species + " - " + this.Age + ")";
    }

    static boolean isPalindrome(String _str) {
        String str = _str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
