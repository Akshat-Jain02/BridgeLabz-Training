package com.day01.vehiclerentalapplication;

public class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        vehicle.displayDetails();
        System.out.println("Rented by: " + name);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: ₹" + vehicle.calculateRent(days));
        System.out.println("--------------------------------");
    }
}
