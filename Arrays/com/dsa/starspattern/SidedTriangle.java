package com.dsa.starspattern;

public class SidedTriangle {
    public static void rightSidedTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseRightSidedTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightSidedTriangle(5);
        reverseRightSidedTriangle(5);
    }
}
