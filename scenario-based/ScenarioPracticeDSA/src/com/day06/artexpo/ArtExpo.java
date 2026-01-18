package com.day06.artexpo;

import java.time.LocalTime;
import java.util.Scanner;

public class ArtExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArtistManager expo = new ArtistManager(50); // max 50 artists

        System.out.println("=== ArtExpo Registration System ===\n");

        while (true) {
            System.out.println("\n1. Register new artist");
            System.out.println("2. Show current sorted list");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter artist name: ");
                String name = sc.nextLine().trim();

                System.out.print("Enter registration time (HH:MM): ");
                String timeStr = sc.nextLine().trim();

                try {
                    LocalTime time = LocalTime.parse(timeStr);
                    Artist artist = new Artist(name, time);
                    expo.addArtist(artist);
                    System.out.println("→ Artist registered successfully!");
                } catch (Exception e) {
                    System.out.println("Invalid time format! Use HH:MM (24-hour)");
                }
            } 
            else if (choice == 2) {
                expo.displaySortedArtists();
            } 
            else if (choice == 3) {
                System.out.println("Thank you for using ArtExpo system!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}