package com.dsa.numberprogram;

public class FindDigits {
    public static void printDigits(int n){
        int number = n;
        while(n != 0){
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        printDigits(268);
    }

}
