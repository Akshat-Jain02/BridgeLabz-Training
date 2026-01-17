package com.day05.robowarehouse;

class Shelf {
    private Package[] packages;
    private int size;
    private final int capacity;

    public Shelf(int capacity) {
        this.capacity = capacity;
        this.packages = new Package[capacity];
        this.size = 0;
    }

    // Main insertion sort logic - insert while keeping sorted order
    public boolean addPackage(Package pkg) {
        if (size >= capacity) {
            System.out.println("Error: Shelf is full! Capacity = " + capacity);
            return false;
        }

        // Find position to insert (from right to left)
        int i = size - 1;
        while (i >= 0 && packages[i].getWeight() > pkg.getWeight()) {
            packages[i + 1] = packages[i];  // shift bigger elements right
            i--;
        }

        // Insert at correct position
        packages[i + 1] = pkg;
        size++;

        System.out.printf("→ Inserted %s at position %d\n", pkg, i + 2);
        return true;
    }

    public void displayShelf() {
        if (size == 0) {
            System.out.println("Shelf is empty.");
            return;
        }

        System.out.println("\nCurrent shelf (sorted by weight):");
        System.out.println("--------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d. %s\n", i + 1, packages[i]);
        }
        System.out.println("--------------------------------\n");
    }

    public int getPackageCount() {
        return size;
    }
}