package com.dsa.arrays;

public class Duplicates {
    public static int removeDuplicates(int[] arr){
        int rd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd;
    }
    public static int removeDuplicatesUnorderedArray(int[] arr, int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println(removeDuplicatesUnorderedArray(arr, val));
    }
}