package com.dsa.starpattern;

import java.util.Scanner;

public class HollowRectangleStar {
    public static void printRectangleHollowStar(int row, int col){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                if ((i==1 || i==col) || (j==1 || j==col)){
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int row = sc.nextInt();
        System.out.print("Enter the Breadth: ");
        int col = sc.nextInt();

        printRectangleHollowStar(row, col);
    }
}
