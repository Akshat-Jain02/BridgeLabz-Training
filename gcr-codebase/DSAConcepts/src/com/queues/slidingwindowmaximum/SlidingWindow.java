package com.queues.slidingwindowmaximum;

public class SlidingWindow {
	
    public static void main(String[] args) {

        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;

        int[] maximums = SlidingWindowMaximum.findMaximums(array, windowSize);

        System.out.println("Sliding Window Maximums:");
        for (int value : maximums) {
            System.out.print(value + " ");
        }
    }
}
