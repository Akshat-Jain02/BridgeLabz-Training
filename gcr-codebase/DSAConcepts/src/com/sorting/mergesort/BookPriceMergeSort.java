package com.sorting.mergesort;

public class BookPriceMergeSort {

    public static void main(String[] args) {

        int[] bookPrices = {450, 299, 799, 150, 999, 550};

        System.out.println("Before Sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }

        MergeSort sorter = new MergeSort();
        sorter.sort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
