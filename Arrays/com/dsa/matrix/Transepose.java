package com.dsa.matrix;

public class Transepose {
    public static int[][] transpose(int[][] arr){
        int[][] trans = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j< arr.length; j++){
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr =  {{1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {5, 10, 15, 20, 25}};

        System.out.println("Simple Array:");
        printMatrix(arr);
        System.out.println();
        System.out.println("Transposed Array: ");
        int[][] result = transpose(arr);
        printMatrix(result);
    }
}
