package com.searching.binarysearch;

import java.util.Arrays;

public class LinearBinaryChallenge {

    // Linear Search: First missing positive
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1]; // Index 0 unused

        // Mark numbers that are present
        for (int num : nums) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1; // If all 1..n are present
    }

    // Binary Search: Find index of target in sorted array
    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array first
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1, 5};
        int target = 4;

        int missing = firstMissingPositive(nums);
        int index = binarySearch(nums, target);

        System.out.println("First missing positive: " + missing);
        System.out.println("Index of target " + target + ": " + index);
    }
}
