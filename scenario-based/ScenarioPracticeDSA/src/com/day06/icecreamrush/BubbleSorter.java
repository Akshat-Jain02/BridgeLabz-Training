package com.day06.icecreamrush;

import java.util.List;

class BubbleSorter {
    
    static void sortBySales(List<Flavor> flavors) {
        int n = flavors.size();
        
        // Bubble Sort - simple and easy to understand
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // If left has fewer sales than right → swap
                if (flavors.get(j).sales < flavors.get(j + 1).sales) {
                    // Swap
                    Flavor temp = flavors.get(j);
                    flavors.set(j, flavors.get(j + 1));
                    flavors.set(j + 1, temp);
                }
            }
        }
    }
}