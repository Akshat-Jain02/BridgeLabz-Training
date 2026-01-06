package com.sorting.countingsort;

class CountingSort {

    public void sort(int[] ages) {

        // Step 1: Find min and max
        int min = ages[0];
        int max = ages[0];

        for (int age : ages) {
            if (age < min) {
                min = age;
            }
            if (age > max) {
                max = age;
            }
        }

        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Step 2: Count frequency
        for (int age : ages) {
            count[age - min]++;
        }

        // Step 3: Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build output array (stable)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - min] - 1] = age;
            count[age - min]--;
        }

        // Step 5: Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
}
