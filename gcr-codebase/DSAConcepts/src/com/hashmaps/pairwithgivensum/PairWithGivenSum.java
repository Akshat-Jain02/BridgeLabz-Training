package com.hashmaps.pairwithgivensum;

import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] array, int targetSum) {

        HashMap<Integer, Boolean> visitedNumbers = new HashMap<>();

        for (int number : array) {

            int requiredValue = targetSum - number;

            if (visitedNumbers.containsKey(requiredValue)) {
                System.out.println("Pair found: " + number + " + " + requiredValue);
                return true;
            }

            visitedNumbers.put(number, true);
        }

        return false;
    }
    
    public static void main(String[] args) {

        int[] array = {8, 7, 2, 5, 3, 1};
        int targetSum = 10;

        if (hasPairWithSum(array, targetSum)) {
            System.out.println("Pair with given sum exists");
        } else {
            System.out.println("No pair with given sum exists");
        }
    }
}
