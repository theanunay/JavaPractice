package com.dsa;

public class FrequencyCheck {
    public static int frequencyOfNumber(int[] arr, int n){
        int frequency = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == n){
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequencyOfChar(String str, char ch){
        int frequency = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == ch){
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 5, 3};
        String str = "annunay";

        System.out.println(frequencyOfChar(str, 'n'));
    }
}
