package com.dsa;

import javax.swing.*;

public class DeficientNumber {
    // sum of its factors is less than the number itself --> Deficient Number
    public static boolean isDeficientNumber(int n){
        int sum = 0;
        for (int i =1; i <n; i++) {
            if (n%i == 0){
                sum += i;
            }
        }
        return sum < n;
    }

    public static void main(String[] args) {
        System.out.println(isDeficientNumber(22));
    }
}
