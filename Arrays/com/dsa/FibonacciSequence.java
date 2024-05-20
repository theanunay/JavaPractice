package com.dsa;

import java.util.ArrayList;

public class FibonacciSequence {
    public static ArrayList<Integer> fibonacciSeries(int n){
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        int a = 0;
        int b = 1;

        fibo.add(0);
        fibo.add(1);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            fibo.add(c);
        }
        return fibo;
    }

    public static int nthFibonacci(int n){
        int a = 0;
        int b = 1;

        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(10));
        System.out.println(nthFibonacci(4));
    }
}
