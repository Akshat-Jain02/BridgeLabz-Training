package com.searching.binarysearch;

public class BinarySearch2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Empty matrix
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D mid index to 2D indices
            int midRow = mid / cols;
            int midCol = mid % cols;

            int midValue = matrix[midRow][midCol];

            if (midValue == target) {
                return true; // Target found
            } else if (midValue < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int target1 = 16;
        int target2 = 13;

        System.out.println("Target " + target1 + " found: " + searchMatrix(matrix, target1));
        System.out.println("Target " + target2 + " found: " + searchMatrix(matrix, target2));
    }
}
