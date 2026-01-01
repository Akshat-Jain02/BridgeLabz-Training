package com.inheritance.hybrid.vehiclemanagement;

public class VehicleManagementSystem {
	public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===\n");

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 260, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Camry", 200, 60);

        // Display details
        ev.showDetails();
        pv.showDetails();

        // Polymorphism with Vehicle superclass
        System.out.println("All Vehicles:");
        Vehicle[] vehicles = {ev, pv};
        for (Vehicle v : vehicles) {
            v.showDetails();
        }

        // Using the Refuelable interface (only petrol vehicle)
        System.out.println("Refueling capable vehicles:");
        if (pv instanceof Refuelable) {
            ((Refuelable) pv).refuel();
        }
    }
}
