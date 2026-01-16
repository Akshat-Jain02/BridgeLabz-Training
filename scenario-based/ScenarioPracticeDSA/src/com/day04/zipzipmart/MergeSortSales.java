package com.day04.zipzipmart
;
class MergeSortSales {
    
    public static void sort(Sale[] sales, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(sales, left, mid);
            sort(sales, mid + 1, right);
            merge(sales, left, mid, right);
        }
    }
    
    private static void merge(Sale[] sales, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        Sale[] leftArr = new Sale[n1];
        Sale[] rightArr = new Sale[n2];
        
        for (int i = 0; i < n1; i++) leftArr[i] = sales[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = sales[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (compareSales(leftArr[i], rightArr[j]) <= 0) {
                sales[k++] = leftArr[i++];
            } else {
                sales[k++] = rightArr[j++];
            }
        }
        
        while (i < n1) sales[k++] = leftArr[i++];
        while (j < n2) sales[k++] = rightArr[j++];
    }
    
    private static int compareSales(Sale a, Sale b) {
        int dateComp = a.date.compareTo(b.date);
        if (dateComp != 0) return dateComp;
        return Double.compare(a.amount, b.amount);
    }
}