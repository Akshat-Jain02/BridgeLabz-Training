package com.sorting.insertionsort;

class InsertionSort {

    public void sort(int[] empIds) {
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }
    }
}
