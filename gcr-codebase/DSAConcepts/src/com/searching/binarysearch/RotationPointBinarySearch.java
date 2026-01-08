package com.searching.binarysearch;

public class RotationPointBinarySearch {

    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Smallest element is in the right half
                left = mid + 1;
            } else {
                // Smallest element is at mid or in left half
                right = mid;
            }
        }

        // left == right, rotation point found
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int rotationIndex = findRotationIndex(arr);
        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
