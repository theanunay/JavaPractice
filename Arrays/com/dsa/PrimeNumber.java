package com.dsa;

import java.util.ArrayList;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n) {
        int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        return count == 2;
    }

    public static ArrayList<Integer> findPrimeBwTwoNumbers(int start, int end) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(findPrimeBwTwoNumbers(1, 11));
        System.out.println(isPrimeNumber(5));
    }
}
