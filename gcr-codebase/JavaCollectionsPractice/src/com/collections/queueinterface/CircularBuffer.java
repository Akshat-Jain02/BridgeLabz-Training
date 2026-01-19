package com.collections.queueinterface;

class CircularBuffer {

    int[] buffer;
    int front = 0, size = 0;
    int capacity;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    void insert(int value) {
        buffer[(front + size) % capacity] = value;

        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // overwrite
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display(); // 2 3 4
    }
}
