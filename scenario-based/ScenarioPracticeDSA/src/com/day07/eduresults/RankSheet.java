package com.day07.eduresults;

import java.util.ArrayList;
import java.util.List;

class RankSheet {
    private List<Student> students;

    public RankSheet() {
        students = new ArrayList<>();
    }

    public void addDistrictList(List<Student> districtList) {
        students.addAll(districtList);
    }

    public void generateFinalRankList() {
        mergeSort(students, 0, students.size() - 1);
    }

    private void mergeSort(List<Student> list, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(list, left, mid);
        mergeSort(list, mid + 1, right);
        merge(list, left, mid, right);
    }

    private void merge(List<Student> list, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Student> leftArr = new ArrayList<>();
        List<Student> rightArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArr.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArr.add(list.get(mid + 1 + j));
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            Student s1 = leftArr.get(i);
            Student s2 = rightArr.get(j);

            if (s1.getMarks() > s2.getMarks() || 
                (s1.getMarks() == s2.getMarks() && s1.getRollNumber() < s2.getRollNumber())) {
                list.set(k, s1);
                i++;
            } else {
                list.set(k, s2);
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }

    public void displayRankSheet() {
        if (students.isEmpty()) {
            System.out.println("No students in rank sheet.");
            return;
        }

        System.out.println("\n                STATE-WIDE RANK LIST");
        System.out.println("------------------------------------------------------------");
        System.out.println("Rank | Roll No  | Name                 | District   | Marks");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("%-5d| %s%n", (i + 1), s);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Total students ranked: " + students.size() + "\n");
    }
}