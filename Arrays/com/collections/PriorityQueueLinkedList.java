package com.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueLinkedList {
    public static void priorityQueue(){
        // It uses min-Heap
        Queue<Integer> priority = new PriorityQueue<>();
        priority.offer(12);
        priority.offer(24);
        priority.offer(8);
        priority.offer(56);
        priority.offer(14);
        priority.offer(16);

        System.out.println(priority);
        priority.poll();
        System.out.println(priority);
        System.out.println(priority.peek());
        priority.poll();
        System.out.println(priority);
    }
    public static void linkedListQueue(){
        Queue<Integer> list = new LinkedList<>();

        list.offer(12);
        list.offer(21);
        list.offer(23);

        System.out.println(list);

        list.poll();
        System.out.println(list.poll());
        System.out.println(list);
    }
    public static void priorityQueue2(){
        // It uses min-Heap
        Queue<Integer> priority2 = new PriorityQueue<>(Comparator.reverseOrder());
        priority2.offer(12);
        priority2.offer(24);
        priority2.offer(8);
        priority2.offer(56);
        priority2.offer(14);
        priority2.offer(16);

        System.out.println(priority2);
        priority2.poll();
        System.out.println(priority2);
        System.out.println(priority2.peek());
        priority2.poll();
        System.out.println(priority2);
    }
    public static void main (String []args){
        priorityQueue2();
    }
}
