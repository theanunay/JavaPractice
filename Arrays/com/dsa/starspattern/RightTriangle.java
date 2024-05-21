package com.dsa.starspattern;

public class RightTriangle {
    public static void rightTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangle(5);
    }
}
