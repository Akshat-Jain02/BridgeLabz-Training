package com.constructors.levelone;

import java.util.Scanner;

public class CarRental {
	 // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    public void calculateTotalCost() {
        double ratePerDay = 0;

        // Set rate per day based on car model
        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 50;
                break;
            case "suv":
                ratePerDay = 80;
                break;
            case "hatchback":
                ratePerDay = 40;
                break;
            default:
                ratePerDay = 60; // default rate
        }

        totalCost = ratePerDay * rentalDays;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rental details
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter car model (Sedan/SUV/Hatchback): ");
        String model = sc.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        // Create CarRental object
        CarRental rental = new CarRental(name, model, days);

        // Display rental information
        System.out.println("\nRental Details:");
        rental.displayDetails();

        sc.close();
    }
}
