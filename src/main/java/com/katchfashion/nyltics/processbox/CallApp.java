package com.katchfashion.nyltics.processbox;

import java.io.IOException;

public class CallApp {


    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("/Applications/Firefox.app");

            Thread.sleep(10000);
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

}
