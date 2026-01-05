package com.stacks.sortstackusingrecursion;
class StackSorter {

    public static void sortStack(Stack stack) {
        if (stack.isEmpty()) {
            return;
        }

        int removedElement = stack.pop();
        sortStack(stack);
        insertInSortedOrder(stack, removedElement);
    }

    private static void insertInSortedOrder(Stack stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
}
