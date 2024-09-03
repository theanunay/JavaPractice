package com.dsa.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
       int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int sm = i; //smallest
            for (int j = i+1; j <n; j++) {
                if (arr[sm] > arr[j]){
                    sm = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[sm];
            arr[sm] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr= {2, 1, 4, 6, 11, 8, 10};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
