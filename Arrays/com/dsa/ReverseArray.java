package com.dsa;

public class ReverseArray {
    public static boolean reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            // swapping
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
//        System.out.println(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(reverseArray(arr));

    }
}
