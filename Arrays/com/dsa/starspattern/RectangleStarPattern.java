package com.dsa.starspattern;

public class RectangleStarPattern {
    public static void printRectangleStarPattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRectangleStarPattern(6);
    }
}
