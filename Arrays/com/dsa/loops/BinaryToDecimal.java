package com.dsa.loops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void binaryToDecimal(int num){
        int temp = num;
        int decimal = 0;
        int i = 0;
        while(temp > 0){
            int r = temp % 10;
            decimal = decimal + r * (int)Math.pow(2, i++);
            temp = temp/10;
        }
        System.out.println("Decimal value of " + num + " is : " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number to Convert : ");
        int num = sc.nextInt();
        binaryToDecimal(num);
    }
}
