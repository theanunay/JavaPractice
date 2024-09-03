package com.dsa.arrays;

import java.util.Arrays;

public class DeleteElement {
    public static void deleteElement(int[] arr, int pos){
        for (int i = pos-1; i <arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Length of Array: " + arr.length);
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 45, 60, 99};
        System.out.println("Length of Array: " + arr.length);

        deleteElement(arr, 6);
//        System.out.println(Arrays.toString(arr));
    }
}
