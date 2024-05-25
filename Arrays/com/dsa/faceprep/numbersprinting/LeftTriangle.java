package com.dsa.faceprep.numbersprinting;

public class LeftTriangle {
    public static void leftTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void leftInvertedTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightSidedTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("# ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightSidedTriangle(5);
    }
}
