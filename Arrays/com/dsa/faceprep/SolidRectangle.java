package com.dsa.faceprep;

public class SolidRectangle {
    public static void solidRectangle(int row, int col){
        for (int i = 1; i <=row; i++) {
            for (int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRectangle(3, 5);
    }
}
