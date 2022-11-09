package com.katchfashion.nyltics.recursbox;


import static java.lang.System.out;


public class BaseCase {

    public int factorial(int num) {
        /**
         * Not the best solution as it will end up in StackOverflow with increased depth
         * Bette solution is storing the result in a variable
         */
        if(num <= 1){ //Base case
            return num;
        }else {
            return factorial(num - 1 ) * num;
        }
    }
    public  int iterativeFactorials(int n) {
        int total = 1;
        for (int i=n; i > 0; i-- ){
            total *= i;
        }

        return total;
    }

    public int fibonacciBasic(int n) {
//        Base case
    if( n < 2) {
        return 1;

    }else {
        return fibonacciBasic(n -1) + fibonacciBasic(n -2);
    }


    }




    public static void main(String[] args) {
        int result = new BaseCase().factorial(5);
        out.println("Heavy Recursive: " + result);
        int iterResults = new BaseCase().iterativeFactorials(5);
        out.println("Iterative Solution: " + iterResults);
    out.println("========================= FIBONACCI ==========================================");
    int fiboResult = new BaseCase().fibonacciBasic(8);
    out.println("Fibonacci Result: " + fiboResult);
    }

}
