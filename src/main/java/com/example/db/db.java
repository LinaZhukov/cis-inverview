package com.example.db;

import com.example.demo.Animal;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class db {
    private List<Animal> data = new ArrayList<>();
    private boolean connected = false;

    public void connect() {
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
            connected = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int count(){
        return data.size();
    }

    public void write(String[] values) {
        Animal i = new Animal(values);
        data.add(i);
    }

    public List<Animal> query() {
        if(!this.connected){
            this.connect();
        }

        return data;
    }
}
