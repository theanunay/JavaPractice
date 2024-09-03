package com.collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
        // Learn ArrayDeque
    public static void arrayDeque(){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offerFirst(45);
        adq.offerLast(63);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll()); // remove from head
        System.out.println("Poll() " + adq);

        System.out.println(adq.pollFirst()); // remove from head
        System.out.println("Poll() " + adq);

        System.out.println(adq.pollLast()); // remove from last
        System.out.println("poll() " + adq);


    }

    public static void main(String[] args) {
        arrayDeque();
    }
}
