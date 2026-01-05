package com.queues.circulartourproblem;

class Queue {
	
    private int[] data;
    private int front, rear, size;

    Queue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        data[++rear] = value;
        size++;
    }

    public int dequeue() {
        size--;
        return data[front++];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
