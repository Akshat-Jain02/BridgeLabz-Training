package com.stacks.queueusingstacks;

class QueueUsingStacks {
	
    private CustomStack inputStack;
    private CustomStack outputStack;

    QueueUsingStacks(int capacity) {
        inputStack = new CustomStack(capacity);
        outputStack = new CustomStack(capacity);
    }

    // Add element to queue
    public void enqueue(int value) {
        inputStack.push(value);
        System.out.println(value + " enqueued");
    }

    // Remove element from queue
    public int dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        if (outputStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return outputStack.pop();
    }

    // Get front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        if (outputStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return outputStack.peek();
    }

    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
