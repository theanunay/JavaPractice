package com.dsa.numberprogram;

public class Palindrome {
    // 121, 24642, 3553
    public static boolean isPalindrome(int n){
        int number = n;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum * 10 + digit;
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(24642));
    }
}
