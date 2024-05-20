package com.dsa.starpattern;

import java.util.Scanner;

public class SquareStar {
    public static void printSquareStar(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printSquareStar(n);
    }
}
