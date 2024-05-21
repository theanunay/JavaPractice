package com.dsa.starspattern;

public class Triangle {
    // Ascening triangle
    public static void ascendingTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void descendingTriangle(int n){
        for (int i =1; i<=n; i++){
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        descendingTriangle(5);
    }
}
