package com.dsa.numberprogram;

public class NeonNumber {
    // Where sum of digits of square of the number is equal to the number. --> Neon Number
    // 9, 9*9 = 81, 9 = 8+1

    public static boolean isNeonNumher(int n){
        int number = n;
        int square = n * n;
        int sum = 0;
        while(square != 0){
            int digit = square%10;
            sum += digit;
            square /= 10;
        }
        return number == sum;
    }

    public static void main(String[] args) {
        System.out.println(isNeonNumher(9));
    }
}
