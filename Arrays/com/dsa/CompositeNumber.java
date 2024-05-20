package com.dsa;

public class CompositeNumber {
    public static boolean isCompositeNumber(int n){
        // More than 1 factor (exclude - 1 and n). --> Composite Number
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0){
                count++;
            }
        }
        return count>2;
    }

    public static void main(String[] args) {
        System.out.println(isCompositeNumber(4));
    }
}
