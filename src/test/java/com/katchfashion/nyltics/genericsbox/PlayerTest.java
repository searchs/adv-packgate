package com.katchfashion.nyltics.genericsbox;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
  protected Player<Integer, String> testPlayer = new Player<>();



    @Test
    void testGet() {

    assertEquals(testPlayer.get(1), "John");
    }

    @Test
    void testPut() {
        testPlayer.put(2, "Sarah");
        assertEquals(testPlayer.get(2), "Sarah");
    }

    @BeforeEach
    void setUp() {
        testPlayer.put(1, "John");
    }

    @AfterEach
    void tearDown() {
        testPlayer.clear();
    }

}