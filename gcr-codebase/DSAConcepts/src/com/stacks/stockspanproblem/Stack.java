package com.stacks.stockspanproblem;

class Stack {
	
    private int[] data;
    private int topIndex;

    Stack(int capacity) {
        data = new int[capacity];
        topIndex = -1;
    }

    public void push(int value) {
        data[++topIndex] = value;
    }

    public int pop() {
        return data[topIndex--];
    }

    public int peek() {
        return data[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
