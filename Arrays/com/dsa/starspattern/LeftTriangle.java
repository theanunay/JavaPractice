package com.dsa.starspattern;

public class LeftTriangle {
    public static void leftTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leftTriangle(6);
    }
}
