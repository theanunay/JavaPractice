package com.dsa.arrays;

public class TransposeArray {
    public static int[][] arrayTranspose(int[][] arr){
        int[][] transposed = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void printTransposedMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] result = arrayTranspose(arr);

        printTransposedMatrix(result);


    }
}
