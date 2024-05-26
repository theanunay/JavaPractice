package com.dsa.arrays;

public class SubArray {
    public static void printSubArray(int [] arr){
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        printSubArray(arr);
    }
}
