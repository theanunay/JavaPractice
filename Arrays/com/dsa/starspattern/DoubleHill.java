package com.dsa.starspattern;

public class DoubleHill {
    public static void printDoubleHill(int n){
        for (int i=1; i<=n; i++) {
            for (int j = i; j <=(n-1) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = n-i; j>=1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDoubleHill(5);
    }
}
