package com.katchfashion.nyltics.genericsbox;

import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {


    public static void main(String[] args) {
        Thing<Integer> checkNum = new Thing<Integer>(9);

        assertEquals(9, checkNum.getThing(),  "Object returned is not a Thing<>");
    }
}