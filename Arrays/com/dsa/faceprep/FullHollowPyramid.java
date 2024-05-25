package com.dsa.faceprep;

public class FullHollowPyramid {
    public static void hollowFullPyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if (j==1 || i==n || j==2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void hollowFullPyramidSecond(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if (j==1 || j==i || i==n)
                System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        hollowFullPyramid(6);
        hollowFullPyramidSecond(6);
    }
}
