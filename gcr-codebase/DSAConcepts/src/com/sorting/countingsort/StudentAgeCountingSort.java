package com.sorting.countingsort;

public class StudentAgeCountingSort {

    public static void main(String[] args) {

        int[] studentAges = {15, 12, 18, 10, 14, 16, 12, 17};

        System.out.println("Before Sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }

        CountingSort sorter = new CountingSort();
        sorter.sort(studentAges);

        System.out.println("\nAfter Sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
