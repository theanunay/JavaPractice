package com.dsa;

public class AbundantNumber {
    public static boolean isAbundantNumber(int n){
        // sum of its factors is greater than the number itself --> Abundant Number
        int sum = 0;
        for (int i = 1; i <n; i++) {
            if (n%i == 0){
                sum += i;
            }
        }

        return sum > n;
    }

    public static void main(String[] args) {
        System.out.println(isAbundantNumber(6));
    }
}
