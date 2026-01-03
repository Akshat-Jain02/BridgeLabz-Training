package com.day02.cabbygo;

class RideService implements IRideService {
	
    private Vehicle vehicle;
    private Driver driver;
    private double fare;       // Encapsulated
    private String location;   // Encapsulated
    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        fare = baseFare + distance * vehicle.ratePerKm;
        location = "Ride in Progress";

        System.out.println("\n🚖 Ride Booked Successfully!");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.type);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        location = "Ride Ended";
        System.out.println("\n Ride Completed");
        System.out.println("Total Fare Paid: ₹" + fare);
    }
}