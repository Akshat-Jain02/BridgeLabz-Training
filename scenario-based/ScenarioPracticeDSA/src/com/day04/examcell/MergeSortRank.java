package com.day04.examcell;

class MergeSortRank {
    
    public static void sort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            sort(students, left, mid);
            sort(students, mid + 1, right);
            
            merge(students, left, mid, right);
        }
    }
    
    private static void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        Student[] leftArr = new Student[n1];
        Student[] rightArr = new Student[n2];
        
        for (int i = 0; i < n1; i++)
            leftArr[i] = students[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = students[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            // Higher marks first → descending order
            if (leftArr[i].marks >= rightArr[j].marks) {
                students[k++] = leftArr[i++];
            } else {
                students[k++] = rightArr[j++];
            }
        }
        
        while (i < n1) students[k++] = leftArr[i++];
        while (j < n2) students[k++] = rightArr[j++];
    }
}