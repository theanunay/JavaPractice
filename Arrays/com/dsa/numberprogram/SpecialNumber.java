package com.dsa.numberprogram;

public class SpecialNumber {
    // Sum of digits + product of digits is equals to original number --> Special Number
    // 59 --> 5+9 + 5*9
    public static boolean isSpecialNumber(int n){
        int number = n;
        int sum = 0;
        int prod = 1;
        while(n != 0){
            int digit = n%10;
            sum = sum + digit;
            prod = prod * digit;
            n /= 10;
        }
        int finalSum = sum + prod;
        return finalSum == number;
    }

    public static void main(String[] args) {
        System.out.println(isSpecialNumber(69));
    }
}
