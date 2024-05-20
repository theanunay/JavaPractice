package com.dsa.numberprogram;

public class NivenHarshadNumber {
    // A number which is divisble by the sum of its digit. --> Niven / Harshad Number
    // e.g. --> 156 = 1+5+6 = 12

    public static boolean isHarshadNumber(int n){
        int number = n;
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return number % sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(isHarshadNumber(158));
    }
}
