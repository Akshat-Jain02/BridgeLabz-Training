package com.searching.binarysearch;

public class PeakElementBinarySearch {

    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                // Peak found
                return mid;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                // Peak is in the left half
                right = mid - 1;
            } else {
                // Peak is in the right half
                left = mid + 1;
            }
        }

        return -1; // Should never reach here if array has at least one element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
