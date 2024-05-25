package com.dsa.starspattern;

public class PyramidOfStars {
    public static void starsPyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starsPyramid(5);
    }
}
