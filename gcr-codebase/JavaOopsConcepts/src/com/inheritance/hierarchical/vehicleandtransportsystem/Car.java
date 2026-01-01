package com.inheritance.hierarchical.vehicleandtransportsystem;

public class Car extends Vehicle{
	private int seatCapacity;
    private int numberOfDoors;

    public Car(int maxSpeed, String fuelType, int seatCapacity, int numberOfDoors) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity + " passengers");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("------------------------");
    }
}
