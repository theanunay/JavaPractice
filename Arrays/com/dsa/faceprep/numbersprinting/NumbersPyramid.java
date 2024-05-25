package com.dsa.faceprep.numbersprinting;

public class NumbersPyramid {
    public static void halfNumberPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void invertedNumberPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void hollowHalfNumberPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i; j++) {
                if (i==1 || j==1 || j==i || i==n){
                    System.out.print(j + " ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void fullNumberPyramid(int n){
        for (int i = 0; i <n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            int count = i+1;
            for (int j = 0; j<=i ; j++) {
                System.out.print(count++ + " ");
            }

            for (int j = i; j >=1 ; j--) {
                System.out.print(j+i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullNumberPyramid(5);
    }
}

