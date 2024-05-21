package com.dsa.numbers;

import java.util.Scanner;

public class RhombusStarPatter {
    public static void printRhombusStarPattern(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int col = sc.nextInt();

        printRhombusStarPattern(row, col);
    }
}
