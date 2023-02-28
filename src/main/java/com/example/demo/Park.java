package com.example.demo;

import com.example.db.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Park {
    db animals = new db();
    HashMap<String, List<Animal>> visitors = new HashMap<>();

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

    /*
    * You may have noticed that some of the animal names are palindromes.
    * Please list them in any order.
    * */
    public List<Animal> palindromes(){
        return animals.query()
                .stream()
                .filter(i -> isPalindrome(i.AnimalName))
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
