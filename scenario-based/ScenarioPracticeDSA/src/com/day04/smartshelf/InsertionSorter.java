package com.day04.smartshelf;

class InsertionSorter {
    public static void insertSorted(String[] books, int size, String newTitle) {
      
        int i = size - 1;
        while (i >= 0 && books[i].compareToIgnoreCase(newTitle) > 0) {
            books[i + 1] = books[i];
            i--;
        }
        books[i + 1] = newTitle;
    }
}