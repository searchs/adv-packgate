package com.katchfashion.nyltics.collectionz;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class HashmapDriver {

    public static void main(String[] args) {
        HashMap<Integer, String> players = new HashMap<Integer, String>();

    players.put(0, "Taiwo");
    players.put(1, "Kehinde");
    players.put(2, "Idowu");
    players.put(3, "Alaba");
    players.put(0, "Idogbe"); //overrides existing entry

    for(Map.Entry<Integer, String> player: players.entrySet()){
        out.println(player);
    }


    }


}
