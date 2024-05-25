package com.dsa.starspattern;

public class ParallelogramStar {
    public static void printParellelogram(int row, int col){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void righSidedParellelogram(int row, int col){
        for (int i = 1; i <=row; i++) {
            for (int j = i; j <col ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printParellelogram(4, 6);
        righSidedParellelogram(4, 6);
    }
}
