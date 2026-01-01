package com.inheritance.single.smarthomedevices;

public class SmartHome {
	public static void main(String[] args) {
        // Create a generic device
        Device genericDevice = new Device("DEV-001", true);

        // Create a thermostat
        Thermostat livingRoomThermostat = new Thermostat(
            "THERM-101", 
            true, 
            22.5, 
            20.0
        );

        System.out.println("=== Smart Home Devices System ===\n");

        System.out.println("Generic Device Status:");
        genericDevice.displayStatus();

        System.out.println("Thermostat Status:");
        livingRoomThermostat.displayStatus();

        // Demonstrate polymorphism
        System.out.println("All Devices (Polymorphic View):");
        Device[] devices = {genericDevice, livingRoomThermostat};

        for (Device device : devices) {
            device.displayStatus();
        }

        // Extra: Change thermostat setting
        System.out.println("After adjusting thermostat to 24°C:");
        livingRoomThermostat.setTemperature(24.0);
        livingRoomThermostat.displayStatus();
    }
}
