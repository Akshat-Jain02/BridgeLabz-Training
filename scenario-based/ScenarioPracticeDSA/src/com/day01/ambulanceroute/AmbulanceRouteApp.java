package com.day01.ambulanceroute;

import java.util.Scanner;

public class AmbulanceRouteApp {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmbulanceRoute hospital = new AmbulanceRoute();

        // Initial setup (circular: Emergency → Radiology → Surgery → ICU → Emergency)
        hospital.addUnit("Emergency", true);
        hospital.addUnit("Radiology", false);
        hospital.addUnit("Surgery", true);
        hospital.addUnit("ICU", false);

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("          Ambulance Route System");
            System.out.println("============================================");
            hospital.showStatus();
            System.out.println("\nCommands:");
            System.out.println("  f  → Find nearest available unit");
            System.out.println("  r  → Rotate to next unit");
            System.out.println("  a  → Set unit available");
            System.out.println("  b  → Set unit busy/unavailable");
            System.out.println("  m  → Maintenance (remove unit)");
            System.out.println("  q  → Quit");
            System.out.print("→ ");

            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice) {
                case "f":
                    String result = hospital.findNearestAvailable();
                    System.out.println("Ambulance should go to → " + result);
                    break;

                case "r":
                    hospital.rotateToNext();
                    break;

                case "a":
                    System.out.print("Unit name to set AVAILABLE: ");
                    String availName = sc.nextLine().trim();
                    hospital.setAvailability(availName, true);
                    break;

                case "b":
                    System.out.print("Unit name to set BUSY: ");
                    String busyName = sc.nextLine().trim();
                    hospital.setAvailability(busyName, false);
                    break;

                case "m":
                    System.out.print("Unit name for MAINTENANCE (remove): ");
                    String removeName = sc.nextLine().trim();
                    hospital.removeUnit(removeName);
                    break;

                case "q":
                    System.out.println("\nThank you for using AmbulanceRoute System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command! Try again.");
            }
        }
    }
}