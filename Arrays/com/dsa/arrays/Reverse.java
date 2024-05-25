package com.dsa.arrays;

public class Reverse {
    public static void reverseArray(int[] arr){
        int i=0, j= arr.length-1;
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String []args){
        int[] arr = {1, 12, 24, 43, 34};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
