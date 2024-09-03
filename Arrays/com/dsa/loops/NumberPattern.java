package com.dsa.loops;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");

        printPattern(5);
    }

    public static void printPattern(int n) {
        // First line
//        for (int i = n; i > 0; i--) {
//            System.out.print(i);
//        }
//        for (int i = 2; i <= n; i++) {
//            System.out.print(i);
//        }
//        System.out.println();

        // Remaining lines
        for (int i = 0; i < n; i++) {
            System.out.print(n-i);
            // Print spaces before the first '1'
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1 || j < (i - 1) * 2 - 1)
                    System.out.print(" ");
            }
            System.out.print(1);
            // Print spaces between the two '1's
//            for (int j = 0; j < (i - 1) * 2 - 1; j++) {
//                System.out.print(" ");
//            }
            if (i != 1) {
                System.out.print(1);
            }
            // Print spaces after the second '1'
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(n-i);
        }
    }
}
