package com.example.demo;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class db {
    List<Object> data = new ArrayList<>();

    private void _read(File file) throws IOException {
        FileReader filereader = new FileReader(file);

        // create csvReader object with parameter
        // filereader and parser
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withSkipLines(1)
                .build();

        // Read all data at once
        List<String[]> allData = csvReader.readAll();

        for(String[] i : allData){
            Animal a = new Animal(i);
            data.add(a);
            System.out.println(Arrays.asList(i));
        }
    }

    void connect() {
        try {
            File file = new File("D:\\dev\\demo\\src\\main\\java\\com\\example\\demo\\animalownerlist.csv");

            _read(file);

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

    public List<Object> query(Object query) {
        return data;
    }
}
