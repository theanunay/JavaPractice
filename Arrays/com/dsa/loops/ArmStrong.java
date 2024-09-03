package com.dsa.loops;

import java.util.Scanner;

public class ArmStrong {
    public static boolean isArmStrongNumbers(int number){
        int temp = number;
        int sum = 0;

        while(temp != 0){
            int digit = temp%10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        return number == sum;
    }

    public static void printAllArmstrongNumbers(int start, int end){
        for (int i = start; i <=end; i++) {
            if (isArmStrongNumbers(i))
                System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int number = sc.nextInt();

        System.out.println(isArmStrongNumbers(number));
        printAllArmstrongNumbers(0, 10000000);

    }
}

