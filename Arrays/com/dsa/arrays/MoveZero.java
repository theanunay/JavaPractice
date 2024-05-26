package com.dsa.arrays;

public class MoveZero {
    public static void moveZeroEnd(int[] arr){
        int z = 0;
        int nz = 0;
        int size = arr.length;
        if (size == 0 || size == 1){
            return;
        }
        while (nz < size){
            if (arr[nz] != 0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else
                nz++;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 5, 0, 6, 7};

        printArray(arr);
        System.out.println();
        moveZeroEnd(arr);
        printArray(arr);
    }
}
