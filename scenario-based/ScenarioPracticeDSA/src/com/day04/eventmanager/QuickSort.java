package com.day04.eventmanager;

class QuickSort {
    
    static void sort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    static int partition(Ticket[] arr, int low, int high) {
        double pivot = arr[high].price;
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;
                // swap
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // place pivot
        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}