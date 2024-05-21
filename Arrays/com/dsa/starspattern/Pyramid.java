package com.dsa.starspattern;

public class Pyramid {
    public static void printPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j=i; j<=(n-1); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reversePyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reversePyramid(5);
    }
}
