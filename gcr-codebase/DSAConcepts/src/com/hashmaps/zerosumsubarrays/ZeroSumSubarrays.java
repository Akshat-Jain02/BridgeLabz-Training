package com.hashmaps.zerosumsubarrays;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] array) {

        // Map to store cumulative sum and list of indices
        HashMap<Integer, List<Integer>> sumMap = new HashMap<>();

        int cumulativeSum = 0;

        // Handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < array.length; i++) {

            cumulativeSum += array[i];

            if (sumMap.containsKey(cumulativeSum)) {
                for (int startIndex : sumMap.get(cumulativeSum)) {
                    System.out.println(
                        "Zero-sum subarray found from index "
                        + (startIndex + 1) + " to " + i
                    );
                }
            }

            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }
    }
    
    public static void main(String[] args) {

        int[] array = {3, 4, -7, 3, 1, 3, 1, -4};

        findZeroSumSubarrays(array);
    }
}
