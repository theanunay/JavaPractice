package com.dsa.faceprep;

public class SolidHalfPyramid {
    public static void halfPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        halfPyramid(6);
        invertedHalfPyramid(6);
    }
}
