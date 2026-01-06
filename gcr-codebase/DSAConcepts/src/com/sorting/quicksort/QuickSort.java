package com.sorting.quicksort;

class QuickSort {

    public void sort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort elements before pivot
            sort(prices, low, pivotIndex - 1);

            // Sort elements after pivot
            sort(prices, pivotIndex + 1, high);
        }
    }

    private int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}
