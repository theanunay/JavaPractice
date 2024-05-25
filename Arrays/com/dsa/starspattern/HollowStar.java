package com.dsa.starspattern;

import java.util.Scanner;

public class HollowStar {
    public static void printHollowStar(int row, int col){
        System.out.println("// Printing Hollow Star Pattern.");
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                if ((i == 1 || j==1) || (i==row || j== col))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        printHollowStar(row, col);
    }
}
