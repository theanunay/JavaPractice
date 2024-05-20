package com.dsa;
import java.util.ArrayList;
public class Factors {
    public static ArrayList<Integer> printFactorial(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= n ; i++) {
            if (n%i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(100));
    }
}
