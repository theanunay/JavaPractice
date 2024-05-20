package com.dsa.numberprogram;

public class DuckNumber {
    // A number which has zeroes present in it --> Duck Number
    // e.g. --> 402, 280

    public static boolean isDuckNumber(int n){
        int count = 0;
        while (n != 0){
            int digit = n%10;
            if (digit == 0){
                count++;
            }
            n /= 10;
        }
        return count >= 1;
    }

    public static void main(String[] args) {
        System.out.println(isDuckNumber(412));
    }
}
