package com.stacks.queueusingstacks;

class CustomStack {
	
    private int[] elements;
    private int topIndex;
    private int capacity;

    CustomStack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        topIndex = -1;
    }

    public void push(int value) {
        if (topIndex == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        elements[++topIndex] = value;
    }

    public int pop() {
        if (topIndex == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return elements[topIndex--];
    }

    public int peek() {
        if (topIndex == -1) {
            return -1;
        }
        return elements[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
