package com.searching.linearsearch;

import java.util.Scanner;

public class FirstNegativeLinearSearch {

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // return index of first negative number
            }
        }
        return -1; // no negative number found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear search
        int result = findFirstNegative(arr);

        // Output result
        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("-1 (No negative number found)");
        }

        sc.close();
    }
}
