package com.dsa.starspattern;

public class HollowPyramidStar {
    public static void hollowPyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                if (k==1 || k==2*i-1 || i==n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void invertedHollowStar(int n){
        // to be updated
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k<=n; k++) {
                if (k==i || k==2*i-1 || i==1){
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowPyramid(5);
    }
}
