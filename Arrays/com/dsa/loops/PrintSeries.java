package com.dsa.loops;

public class PrintSeries {
    // Print Series : 1,6,13,22,33,46,…………for n-time
    public static void printSeries(int n){
        int term = 1;
        int difference = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term += difference;
            difference += 2;
        }
    }
//    Print series! 3,7,15,31,63,127…………for n-time
    public static void printSeries2(int n){
        int term = 2; // 4, 8, 16
        for (int i = 0; i < n; i++) {
            System.out.print(term * 2 -1 + " ");
            term *= 2;
        }
    }
//    Print Series 1,2,9,28,65............for n-time
    public static void printSeries3(int n){
        for (int i = 0; i <n; i++) {
            System.out.print(i*i*i+1 + " ");
        }
    }
//    Print Series 1 12 123 1234 …………n-time
    public static void printSeries4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
//    Print Series 6, 12, 21, 33, 48.......n-time
    public static void printSeries5(int n){
        int term = 6;
        int diff = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(term+ " ");
            term += diff;
            diff += 3;
        }
    }

    public static void main(String[] args) {
        printSeries(10);
        System.out.println();
        printSeries2(10);
        System.out.println();
        printSeries3(10);
        System.out.println();
        printSeries4(10);
        System.out.println();
        printSeries5(10);
    }
}
