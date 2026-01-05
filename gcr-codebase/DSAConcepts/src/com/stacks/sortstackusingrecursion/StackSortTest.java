package com.stacks.sortstackusingrecursion;

public class StackSortTest {
	
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);

        System.out.print("Original Stack: ");
        stack.display();

        StackSorter.sortStack(stack);

        System.out.print("Sorted Stack: ");
        stack.display();
    }
}
