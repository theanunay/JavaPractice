package com.dsa.arrays;

import org.w3c.dom.ls.LSOutput;

public class MatrixAddition {
    public static int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = 2;
        int col = 2;
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
//                System.out.print(sum[i][j] + " ");
            }
        }
            return sum;
    }

    public static int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row = 2;
        int col = 2;
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = matrix1[i][j] * matrix2[i][j];
//                System.out.print(sum[i][j] + " ");
            }
        }
            return sum;
    }
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {9, 11}};

        System.out.println("Matrix 1: ");
        printMatrix(matrix1);
        System.out.println("Matrix 2: ");
        printMatrix(matrix2);

        int[][] addition = additionMatrix(matrix1, matrix2);
        int[][] multiplication = multiplicationMatrix(matrix1, matrix2);
        System.out.println("Addition of two matrices: ");
        printMatrix(addition);

        System.out.println("Multiplication of two matrices: ");
        printMatrix(multiplication);


    }
}
