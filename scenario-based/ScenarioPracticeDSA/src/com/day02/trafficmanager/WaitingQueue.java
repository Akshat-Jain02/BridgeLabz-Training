package com.day02.trafficmanager;

import java.util.*;

class WaitingQueue {
    Queue<String> queue = new LinkedList<>();
    int capacity;

    WaitingQueue(int capacity) {
        this.capacity = capacity;
    }

    void enqueue(String car) {
        if (queue.size() == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        queue.add(car);
    }

    String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        return queue.poll();
    }
}