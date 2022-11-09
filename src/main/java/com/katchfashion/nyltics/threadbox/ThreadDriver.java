package com.katchfashion.nyltics.threadbox;

import static java.lang.System.out;

class NewYear implements Runnable {

    @Override
    public void run() {
        countDown();
    }

    public void countDown() {
        for (int i = 10; i > 0; i--) {
            out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
//                throw new RuntimeException(e);
            }
        }
        out.println("Happy New Year!");
    }

}


public class ThreadDriver {
    public static void main(String[] args) {
        NewYear newYear = new NewYear();
        Thread thread = new Thread(newYear);
        thread.start();
    }

}
