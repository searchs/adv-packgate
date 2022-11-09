package com.katchfashion.nyltics.collectionz;

import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.System.out;

public class IteratorDriver {

    public static void main(String[] args) {
        ArrayList<Integer> noms = new ArrayList<Integer>();
        noms.add(21);
        noms.add(32);
        noms.add(44);
        noms.add(90);
        noms.add(23);
        noms.add(76);
        noms.add(82);
        noms.add(65);

        Iterator iterator = noms.iterator();

        while (iterator.hasNext()) {
            Integer currentNom = (Integer) iterator.next();
            out.println(currentNom);

            if (currentNom < 60) {
                iterator.remove();
            }

        }

        out.println("======================================");
        for (Integer x : noms) {
            out.println(x);
        }

    }


}
