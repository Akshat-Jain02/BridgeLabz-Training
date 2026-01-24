package com.day09.medwarehouse;

class MedicineSorter {
    
    static void mergeSort(Medicine[] a, int left, int right) {
        if (left >= right) return;
        
        int mid = left + (right - left) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }
    
    private static void merge(Medicine[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];
        
        for (int i = 0; i < n1; i++) L[i] = a[left + i];
        for (int j = 0; j < n2; j++) R[j] = a[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (!L[i].expiry.isAfter(R[j].expiry)) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }
        
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }
    
    static void sort(Medicine[] medicines) {
        if (medicines == null || medicines.length <= 1) return;
        mergeSort(medicines, 0, medicines.length - 1);
    }
}