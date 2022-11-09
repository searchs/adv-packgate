package com.katchfashion.nyltics.collectionz;

import java.util.ArrayList;

import static java.lang.System.out;

public class ArrayListDriver {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); //Can use Generics

        names.add("Fola");
        names.add("Bola");
        names.add("Sola");
        names.add("Tola");
        names.add("Rola");
        names.add("Kunle");
        names.add("Funke");


        out.println(names.get(3));
        for (String a: names){
            out.println(a);
        }
    }
}
