package com.dsa.starpattern;

import java.util.Scanner;

public class RectangleStar {
    public static void printRectangleStar(int row, int col){
        for (int i = 1; i <=row; i++) {
            for (int j =1; j <=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int row = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int col = sc.nextInt();

        printRectangleStar(row, col);
    }
}
