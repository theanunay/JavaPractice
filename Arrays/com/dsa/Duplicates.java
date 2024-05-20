package com.dsa;

public class Duplicates {
    public static boolean findDuplicatesElementsInArrar(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + ", ");
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 4, 1, 1, 2};

        System.out.println(findDuplicatesElementsInArrar(arr));
    }
}
