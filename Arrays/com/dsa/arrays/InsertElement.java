package com.dsa.arrays;

import java.util.Arrays;

public class InsertElement {
    public static void insertElement(int[] arr, int pos, int element){
        // {10, 20, 30, 45, 60, 99};
        for (int i=arr.length-1; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = element;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 45, 60, 99};

        insertElement(arr, 4, 100);
        System.out.println(Arrays.toString(arr));
    }
}
