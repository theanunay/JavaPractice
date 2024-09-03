package com.dsa.loops;

public class QuestSet2 {
    public static void Pattern1(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n*2-1; j++) {
                if (i == 0 && j < n)
                    System.out.print(n-j);
                else if (i == 0) {
                    System.out.print(j-3);
                } else if (j == 0 || j == n * 2 - 2) {
                    System.out.print(n-i);
                } else if (i+j == n-1 || j-i == n-1) {
                    System.out.print(1);
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1(5);
    }
}
