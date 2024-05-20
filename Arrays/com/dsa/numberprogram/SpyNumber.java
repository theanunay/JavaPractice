package com.dsa.numberprogram;

public class SpyNumber {
    // Sum of its digits is equals to the product of the digits --> Spy Number
    public static boolean isSpyNumber(int n){
        int number = n;
        int sum = 0;
        int pro = 1;
        while (n != 0){
            int digit = n % 10;
            sum = sum + digit;
            pro = pro * digit;
            n /= 10;
        }
        return sum == pro;
    }

    public static void main(String[] args) {
        System.out.println(isSpyNumber(124));
    }
}
