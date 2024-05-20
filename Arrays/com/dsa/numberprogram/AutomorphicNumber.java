package com.dsa.numberprogram;

public class AutomorphicNumber {
    // It is a number which is contained in the last digit(s) of its square --> Automorphic Number
    // e.g. --> 25 in 625
    public static boolean isAutoorphicNumber(int n){
        int number = n;
        int square = n*n;
        int flag = 0;
        while (n != 0){
            int d = n%10;
            int d1 = square%10;
            if (d != d1){
                flag = 1;
            }
            n /= 10;
            square /= 10;
        }

        return flag == 0;
    }

    public static void main(String[] args) {
        System.out.println(isAutoorphicNumber(5));
    }
}
