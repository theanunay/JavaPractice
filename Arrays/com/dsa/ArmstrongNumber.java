package com.dsa;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int n){
        int pow = noOfDigits(n);
        int digits = 0;
        int number = n;
        double sum = 0;

        while (n != 0){
            digits = n % 10;
            sum += Math.pow(digits, pow);
            n = n/10;
        }

        return sum == number;
    }
    public static int noOfDigits(int n){
        int count = 0; // 1
        int number = n;

        while(n != 0){
          int digit = n%10;
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
}
