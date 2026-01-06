package com.sorting.bubblesort;

public class StudentMarksBubbleSort {

    public static void main(String[] args) {

        int[] marks = {78, 45, 89, 62, 91, 55};

        System.out.println("Before Sorting:");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        BubbleSort sorter = new BubbleSort();
        sorter.sort(marks);

        System.out.println("\nAfter Sorting:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
