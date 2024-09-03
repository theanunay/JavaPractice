package com.dsa.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int num){
        int temp = num;
        String binary = "";
        int i = 0;
        while(temp > 0){
            int r = temp%2;
            binary = r + binary;
            temp = temp/2;
        }
        System.out.println(binary);
    }
    public static boolean isPrimeNumber(int n){
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if (n%i == 0)
                count++;
        }
        return count==2;
    }

    public static ArrayList<Integer> findPrimeNumber(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i))
                list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting point : ");
        int start = sc.nextInt();
        System.out.print("Ending point : ");
        int end = sc.nextInt();

        System.out.println(findPrimeNumber(start, end));
    }
}
