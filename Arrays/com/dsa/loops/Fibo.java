package com.dsa.loops;

import java.util.ArrayList;
import java.lang.Integer;

public class Fibo {
    public static ArrayList<Integer> printFibo(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int first = 0;
        int second = 1;
        arr.add(first);
        arr.add(second);

        for (int i = 2; i <n; i++) {
            int c = first + second;
            first  = second;
            second = c;

            arr.add(c);

        }
        return arr;
    }
    public static Integer findLastFibo(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int first = 0;
        int second = 1;
        arr.add(first);
        arr.add(second);

        for (int i = 2; i <n; i++) {
            int c = first + second;
            first  = second;
            second = c;

            arr.add(c);
        }
        return arr.get(n - 1);
    }
    public static int printLastFibo(int n) {
        int a = 0;
        int b = 1;

        int c = 0;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(printFibo(10));
        System.out.println(findLastFibo(10));
        System.out.println(n + "th Fibo Series is : " + printLastFibo(n));
    }
}

