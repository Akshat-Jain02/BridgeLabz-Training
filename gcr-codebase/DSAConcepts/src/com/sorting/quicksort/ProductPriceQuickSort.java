package com.sorting.quicksort;

public class ProductPriceQuickSort {

    public static void main(String[] args) {

        int[] productPrices = {1200, 450, 999, 300, 1500, 700};

        System.out.println("Before Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }

        QuickSort sorter = new QuickSort();
        sorter.sort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
