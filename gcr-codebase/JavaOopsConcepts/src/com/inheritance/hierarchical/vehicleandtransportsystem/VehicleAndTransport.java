package com.inheritance.hierarchical.vehicleandtransportsystem;

public class VehicleAndTransport {
	public static void main(String[] args) {
        // Create different vehicle objects
        Vehicle car = new Car(220, "Petrol", 5, 4);
        Vehicle truck = new Truck(120, "Diesel", 15.5, true);
        Vehicle motorcycle = new Motorcycle(280, "Petrol", "Sport", false);
        Vehicle basicVehicle = new Vehicle(100, "Electric");

        System.out.println("=== Vehicle and Transport System ===\n");

        System.out.println("Individual Vehicle Details:\n");
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
        basicVehicle.displayInfo();

        // Demonstrate Polymorphism
        System.out.println("Polymorphic Behavior (All treated as Vehicle):\n");
        Vehicle[] vehicles = {car, truck, motorcycle, basicVehicle};

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
