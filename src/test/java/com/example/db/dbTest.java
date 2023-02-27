package com.example.db;

import com.example.db.db;
import com.example.demo.Animal;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        connection.connect();
        assertEquals(11, connection.count());
        connection.write(new String[]{"Tomathin", "Bear", "5", "Lina",});
        assertEquals(12, connection.count());
    }

    @Test
    void dontWriteNegative() {
        connection.connect();
        assertEquals(11, connection.count());
        connection.write(new String[]{"Timathin", "Bear", "-5", "Lina",});
        assertEquals(11, connection.count());
    }

    @Test
    void query() {
        connection.connect();
        List<Animal> result = connection.query();
        assertEquals(11, result.size());
    }

    @Test
    void dontResetConnection(){
        connection.connect();
        assertEquals(11, connection.count());
        connection.write(new String[]{"Alf", "Alien", "285", "Lina",});
        List<Animal> result = connection.query();
        assertEquals(12, result.size());
    }
}
