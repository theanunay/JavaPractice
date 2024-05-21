package com.dsa.starspattern;

public class DownwardTriangle {
    public static void leftDownwardTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightDownwardTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Left Downward Triangle: ");
        leftDownwardTriangle(5);
        System.out.println("Right Downward Triangle: ");
        rightDownwardTriangle(5);
    }
}
