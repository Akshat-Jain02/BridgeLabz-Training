package com.queues.slidingwindowmaximum;

class SlidingWindowMaximum {

    public static int[] findMaximums(int[] array, int windowSize) {
        int n = array.length;
        int[] result = new int[n - windowSize + 1];

        Deque indexDeque = new Deque(n);

        int resultIndex = 0;

        for (int currentIndex = 0; currentIndex < n; currentIndex++) {

            // Remove indices outside current window
            if (!indexDeque.isEmpty()
                    && indexDeque.getFirst() <= currentIndex - windowSize) {
                indexDeque.removeFirst();
            }

            // Remove smaller elements from rear
            while (!indexDeque.isEmpty()
                    && array[indexDeque.getLast()] <= array[currentIndex]) {
                indexDeque.removeLast();
            }

            indexDeque.addLast(currentIndex);

            // Store max when first window is complete
            if (currentIndex >= windowSize - 1) {
                result[resultIndex++] = array[indexDeque.getFirst()];
            }
        }

        return result;
    }
}
