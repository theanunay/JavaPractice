package com.dsa.starspattern;

public class MountainTriangle {
    public static void mountainTrianglePattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j =1; j <i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // the best approach
    public static void otherMountain(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseMountainTriangle(int n){
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        otherMountain(5);
    }
}
