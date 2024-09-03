package com.collections;

import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    // HashSet
    public static void learnHashSet(){
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(23);
        set.add(67);
        set.add(45);
        set.add(56);


        set.add(56); // duplicate values not allowed in Set
        System.out.println(set);

        set.remove(56);
        System.out.println(set);

        System.out.println(set.contains(100)); // returns boolean value

        System.out.println(set.isEmpty()); // returns boolean value

        System.out.println(set.size());
        set.clear(); // returns empty array
        System.out.println(set);
    }

    public static void main(String[] args) {
        learnHashSet();
    }
}
