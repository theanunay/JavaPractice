package com.dsa.faceprep;

public class FullPyramid {
    public static void fullStarPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
    public static void invertedFullPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        fullStarPyramid(6);
        invertedFullPyramid(6);
    }
}
