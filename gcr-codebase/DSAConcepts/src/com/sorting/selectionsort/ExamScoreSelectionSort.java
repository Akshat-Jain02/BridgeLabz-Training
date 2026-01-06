package com.sorting.selectionsort;

public class ExamScoreSelectionSort {

    public static void main(String[] args) {

        int[] examScores = {78, 92, 65, 88, 70, 95};

        System.out.println("Before Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }

        SelectionSort sorter = new SelectionSort();
        sorter.sort(examScores);

        System.out.println("\nAfter Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
