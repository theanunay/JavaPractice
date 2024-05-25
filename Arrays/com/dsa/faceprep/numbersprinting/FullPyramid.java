package com.dsa.faceprep.numbersprinting;

public class FullPyramid {
    public static void fullPyramidNumber(int n){
        for (int i = 0; i <n ; i++) {
            int count = i+1;
            for (int j = 1; j<=n ; j++) {
                if (j+i>=n){
                    System.out.print(count++ + " ");
                }  else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        fullPyramidNumber(5);
    }
}
