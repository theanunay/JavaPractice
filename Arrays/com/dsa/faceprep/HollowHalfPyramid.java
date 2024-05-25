package com.dsa.faceprep;

public class HollowHalfPyramid {
    public static void hollowPyramidHalf(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                if (i==0 || j==0 || j==n-i-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowPyramidHalf(6);
    }
}
