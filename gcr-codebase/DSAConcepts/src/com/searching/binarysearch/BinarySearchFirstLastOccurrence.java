package com.searching.binarysearch;

public class BinarySearchFirstLastOccurrence {

    // Function to find first occurrence
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Update result
                right = mid - 1;    // Move left to find first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Function to find last occurrence
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Update result
                left = mid + 1;     // Move right to find last occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        int target = 2;

        int firstIndex = findFirst(arr, target);
        int lastIndex = findLast(arr, target);

        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }
}
