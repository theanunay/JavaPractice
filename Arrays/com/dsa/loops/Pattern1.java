package com.dsa.loops;

public class Pattern1 {
    public static void printPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n*2-1; j++) {
                if (j == 0 || j == n*2-2)
                    System.out.print(n-i);
                else if (j<n && i == 0)
                System.out.print(n-j);
                else if (j>=n && i == 0)
                    System.out.print(j-n+2);
                else if (j-i == n-1 || j+i == n-1 )
                    System.out.print(1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Wrong approach --> have to be solved.
    public static int decimalNumber(int n){
        int number = n;
        int decimal = 0;
        int i = 0;
        while (number > 0){
            int r = number % 10;
            decimal = decimal + r*2*i;
            number = number/10;
            i++;
        }
        return decimal;
    }
    

    public static void deleteElement(int [] arr, int target){
//        int[] arr = {10, 45, 10, 10, 87, 45, 96, 23, 78, 10};
        int n = arr.length;
        int pointer = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != target){
                arr[pointer++] = arr[i];
            }
        }
        while (pointer < n){
            arr[pointer++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 87, 45, 96, 23, 78, 10};
        int target = 10;
        deleteElement(arr, target);
    }
}
