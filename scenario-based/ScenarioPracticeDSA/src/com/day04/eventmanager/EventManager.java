package com.day04.eventmanager;

import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many tickets? ");
        int n = sc.nextInt();
        
        Ticket[] tickets = new Ticket[n];
        
        System.out.println("Enter ticket (name price):");
        for (int i = 0; i < n; i++) {
            System.out.print("Ticket " + (i+1) + ": ");
            String name = sc.next();
            double price = sc.nextDouble();
            tickets[i] = new Ticket(name, price);
        }
        
        // Sort using Quick Sort
        QuickSort.sort(tickets, 0, n-1);
        
        System.out.println("\n--- Sorted Tickets (Cheapest to Most Expensive) ---");
        System.out.println("No   Event               Price");
        System.out.println("-------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d   %-18s  ₹%.2f\n", 
                             (i+1), tickets[i].name, tickets[i].price);
        }
        
        System.out.println("\nTop 5 cheapest tickets:");
        for (int i = 0; i < Math.min(5, n); i++) {
            System.out.printf("  %-18s  ₹%.2f\n", 
                             tickets[i].name, tickets[i].price);
        }
        
        sc.close();
    }
}