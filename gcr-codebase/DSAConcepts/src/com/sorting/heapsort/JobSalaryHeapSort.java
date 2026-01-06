package com.sorting.heapsort;

public class JobSalaryHeapSort {

    public static void main(String[] args) {

        int[] salaryDemands = {65000, 45000, 80000, 30000, 70000, 55000};

        System.out.println("Before Sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }

        HeapSort sorter = new HeapSort();
        sorter.sort(salaryDemands);

        System.out.println("\nAfter Sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
