package com.dsa.arrays;

public class Search {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low <= high){
            mid = (low+high)/2;
            if (key == arr[mid]){
                return mid;
            } else if(key < arr[mid]){
                high = mid-1;
//                low = low;
            } else
                low = mid+1;
//            high = high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 10, 11};

        System.out.println(binarySearch(arr, 10));

    }
}
