package com.queues.slidingwindowmaximum;

class Deque {
	
    private int[] data;
    private int front;
    private int rear;
    private int size;

    Deque(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int value) {
        rear++;
        data[rear] = value;
        size++;
    }

    public void removeLast() {
        rear--;
        size--;
    }

    public void removeFirst() {
        front++;
        size--;
    }

    public int getFirst() {
        return data[front];
    }

    public int getLast() {
        return data[rear];
    }
}
