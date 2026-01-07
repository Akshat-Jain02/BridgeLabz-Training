package com.day05.parkease;

import java.util.Scanner;

public class ParkEase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ParkingSlot slot = new ParkingSlot(101, "Sector A", "Car");
        ParkingSystem system = new ParkingSystem();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
        String type = sc.nextLine();

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        Vehicle vehicle = null;

        switch (type.toLowerCase()) {
            case "car":
                vehicle = new Car(number);
                break;
            case "bike":
                vehicle = new Bike(number);
                break;
            case "truck":
                vehicle = new Truck(number);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                sc.close();
                return;
        }

        system.parkVehicle(slot, vehicle, hours);
        system.showLogs();

        sc.close();
    }
}