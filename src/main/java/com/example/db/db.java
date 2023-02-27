package com.example.db;

import com.example.demo.Animal;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class db {
    List<Animal> data = new ArrayList<>();

    void connect() {
        try {
            File file = new File("D:\\dev\\demo\\src\\main\\java\\com\\example\\db\\animalownerlist.csv");

            Scanner stream = new Scanner(file);

            //skip the first line
            stream.nextLine();

            while (stream.hasNext()) {
                String line = stream.nextLine();
                String[] values = line.split(",");
                Animal i = new Animal(values);
                data.add(i);
            }

            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int count(){
        return data.size();
    }

    public Object write(Object data) {
        return data;
    }

    public List<Animal> query(Object query) {
        return data;
    }
}
