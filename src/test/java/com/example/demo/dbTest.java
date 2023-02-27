package com.example.demo;

import com.example.demo.db;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class dbTest {
    db connection = new db();

    @Test
    void connect(){
        connection.connect();
        int recordsLoaded = connection.count();
        assertEquals(11, recordsLoaded);
    }

    @Test
    void write() {
    }

    @Test
    void query() {
    }
}
