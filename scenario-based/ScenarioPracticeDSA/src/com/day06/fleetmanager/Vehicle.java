package com.day06.fleetmanager;

class Vehicle {
    String reg;
    int mileage;
    String depot;

    Vehicle(String reg, int mileage, String depot) {
        this.reg = reg;
        this.mileage = mileage;
        this.depot = depot;
    }

    public String toString() {
        return reg + " " + mileage + " " + depot;
    }
}