package com.stacks.sortstackusingrecursion;

class Stack {
	
    private int[] elements;
    private int topIndex;

    Stack(int capacity) {
        elements = new int[capacity];
        topIndex = -1;
    }

    public void push(int value) {
        elements[++topIndex] = value;
    }

    public int pop() {
        return elements[topIndex--];
    }

    public int peek() {
        return elements[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void display() {
        for (int i = topIndex; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
