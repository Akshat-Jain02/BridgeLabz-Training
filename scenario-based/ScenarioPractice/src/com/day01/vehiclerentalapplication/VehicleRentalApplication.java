package com.day01.vehiclerentalapplication;

public class VehicleRentalApplication {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Akshat");

        Vehicle bike = new Bike("BIKE101");
        Vehicle car = new Car("CAR202");
        Vehicle truck = new Truck("TRUCK303");

        customer.rentVehicle(bike, 2);
        customer.rentVehicle(car, 3);
        customer.rentVehicle(truck, 1);
    }
}
