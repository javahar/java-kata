package com.focused.practice.org.priorityqueue;

import java.util.*;

public class PriorityQueueBasic {
    /* With priority queue its a good idea to mention the comparator compare
     * expression (n1, n2) -> n1 - n2 is nothing but its a way of comparing
     * one element in the priority queue. with the next
     *
     * Imagine if we are dealing with objects and need to specify a different
     * compare strategy. Then this will come in handy.
     *  */
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((n1, n2) -> n1 - n2);
        priorityQueue.add(12);
        priorityQueue.add(5);
        priorityQueue.add(3);

        // poll gives the least in priority element.
        System.out.println(priorityQueue.poll());

        priorityQueue.add(8);
        System.out.println(priorityQueue.poll());


    }
}
