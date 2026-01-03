package com.day02.cabbygo;

import java.util.Scanner;

public class CabbyGoApp {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Driver
        Driver driver = new Driver("Rahul", "DL12345", 4.8);

        // Vehicle Selection
        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        int choice = sc.nextInt();

        Vehicle vehicle;
        switch (choice) {
            case 1:
                vehicle = new Mini("MH01AB1234");
                break;
            case 2:
                vehicle = new Sedan("MH02CD5678");
                break;
            case 3:
                vehicle = new SUV("MH03EF9012");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Distance Input
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        // Ride Booking
        RideService ride = new RideService(vehicle, driver);
        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}