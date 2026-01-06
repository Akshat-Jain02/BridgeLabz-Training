package com.sorting.insertionsort;

public class EmployeeIdInsertionSort {

    public static void main(String[] args) {

        int[] employeeIds = {1045, 1021, 1090, 1012, 1056};

        System.out.println("Before Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        InsertionSort sorter = new InsertionSort();
        sorter.sort(employeeIds);

        System.out.println("\nAfter Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
