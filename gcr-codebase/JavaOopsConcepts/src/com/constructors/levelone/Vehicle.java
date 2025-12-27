package com.constructors.levelone;
import java.util.Scanner;
public class Vehicle {
	 // Class variable (common for all vehicles)
    static double registrationFee = 5000; // default fee

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("-------------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Ravi Kumar", "Car");
        Vehicle vehicle2 = new Vehicle("Anita Sharma", "Bike");

        // Display details before updating registration fee
        System.out.println("Before updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update registration fee
        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Display details after updating registration fee
        System.out.println("After updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        sc.close();
    }
}
