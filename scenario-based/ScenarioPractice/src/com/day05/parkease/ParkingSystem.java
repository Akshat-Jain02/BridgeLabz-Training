package com.day05.parkease;

import java.util.*;

class ParkingSystem {
	
    private List<String> bookingLogs = new ArrayList<>();

    public void parkVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {
        if (!slot.isAvailable()) {
            System.out.println("Slot already occupied.");
            return;
        }

        if (!slot.getVehicleTypeAllowed().equalsIgnoreCase(
                vehicle.getClass().getSimpleName())) {
            System.out.println("Vehicle type not allowed in this slot.");
            return;
        }

        slot.occupySlot();
        double charges = vehicle.calculateCharges(hours);

        bookingLogs.add("Slot " + slot.getSlotId() + " | Vehicle: "
                + vehicle.getClass().getSimpleName()
                + " | Hours: " + hours
                + " | Charges: ₹" + charges);

        System.out.println("Vehicle parked successfully.");
        System.out.println("Total Charges: ₹" + charges);
    }

    public void showLogs() {
        System.out.println("\n Booking Logs:");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}