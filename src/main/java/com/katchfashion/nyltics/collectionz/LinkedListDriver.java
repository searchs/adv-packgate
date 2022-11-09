package com.katchfashion.nyltics.collectionz;

import java.util.LinkedList;

import static java.lang.System.out;

public class LinkedListDriver {

    public static void main(String[] args) {
        LinkedList<String> skools = new LinkedList<String>();
        skools.add("Oxford");
        skools.add("Cambridge");
        skools.add("Imperial");
        skools.add("Harvard");
        skools.add("Wharton");

        for (String sk : skools) {
            out.println(sk);
        }


    }

}
