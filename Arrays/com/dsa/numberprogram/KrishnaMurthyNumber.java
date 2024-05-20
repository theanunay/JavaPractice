package com.dsa.numberprogram;

public class KrishnaMurthyNumber {
    // Where sum of factorial of digits is equal to the number. --> KM Number
    // e.g. --> 145 = 1! + 4! + 5!

    public static boolean isKmNumber(int n){
        int number = n;
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            int fact = 1;
            for (int i = 1; i <= digit ; i++) {
                fact = fact * i;
            }
            sum += fact;
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isKmNumber(145));
    }
}
