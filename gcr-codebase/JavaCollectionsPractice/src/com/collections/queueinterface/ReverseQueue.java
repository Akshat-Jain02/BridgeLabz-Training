package com.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty())
            return;

        int front = q.remove();
        reverse(q);
        q.add(front);
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        
        System.out.println("Original Queue elements : " + q); //[10, 20, 30]
        
        reverse(q);

        System.out.println("Reversed Queue Elements : " + q); // [30, 20, 10]
    }
}
