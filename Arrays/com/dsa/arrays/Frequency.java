package com.dsa.arrays;

public class Frequency {
    public static void checkFrequency(int[] arr){
        int freq = 1;
        int i = 1;
        while (i < arr.length){
            while (i < arr.length && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + ": - " + freq);
            freq = 1;
            i++;
        }
        if (arr.length==1 || arr[i-1] != arr[i-2]){
            System.out.print(arr[i-1] + ": - " + freq);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 30, 40};

        checkFrequency(arr);
    }
}
