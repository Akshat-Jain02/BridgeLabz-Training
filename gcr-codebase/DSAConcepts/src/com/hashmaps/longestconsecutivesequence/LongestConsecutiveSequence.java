package com.hashmaps.longestconsecutivesequence;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int findLongestConsecutiveSequence(int[] array) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Store all numbers in HashMap
        for (int number : array) {
            map.put(number, true);
        }

        int longestSequence = 0;

        for (int number : array) {

            // Check if number is the start of a sequence
            if (!map.containsKey(number - 1)) {

                int currentNumber = number;
                int currentLength = 1;

                while (map.containsKey(currentNumber + 1)) {
                    currentNumber++;
                    currentLength++;
                }

                longestSequence = Math.max(longestSequence, currentLength);
            }
        }

        return longestSequence;
    }
    
    public static void main(String[] args) {

        int[] array = {100, 4, 200, 1, 3, 2};

        int result = findLongestConsecutiveSequence(array);

        System.out.println("Length of longest consecutive sequence: " + result);
    }
    
}
