package com.day06.icecreamrush;

import java.util.*;

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Flavor> flavors = new ArrayList<>();

        System.out.println("=== IceCreamRush Weekly Sales ===");
        System.out.println("Enter 8 flavors with their sales count\n");

        for (int i = 1; i <= 8; i++) {
            System.out.print("Flavor " + i + " name: ");
            String name = sc.nextLine().trim();

            System.out.print("Sales (cups): ");
            int sales = sc.nextInt();
            sc.nextLine(); // consume newline

            flavors.add(new Flavor(name, sales));
        }

        // Sort using Bubble Sort
        BubbleSorter.sortBySales(flavors);

        // Show result
        System.out.println("\n=====================================");
        System.out.println("   WEEKLY RANKING - MOST POPULAR FIRST   ");
        System.out.println("=====================================");
        System.out.println(" Rank   Flavor                Sales");
        System.out.println("-------------------------------------");

        for (int i = 0; i < flavors.size(); i++) {
            System.out.printf("  %2d   %s\n", (i + 1), flavors.get(i));
        }

        System.out.println("=====================================");
        
        sc.close();
    }
}