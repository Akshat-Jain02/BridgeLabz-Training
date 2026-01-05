package com.stacks.queueusingstacks;

public class QueueUsingStackTest {
	
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
    
    }
}
