package com.inheritance.single.smarthomedevices;

public class Thermostat extends Device{
	private double temperatureSetting;
    private double currentTemperature;

    public Thermostat(String deviceId, boolean status, double temperatureSetting, double currentTemperature) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
        this.currentTemperature = currentTemperature;
    }

    public void setTemperature(double temp) {
        this.temperatureSetting = temp;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();  // Show basic device info
        System.out.println("Type: Thermostat");
        System.out.println("Target Temperature: " + temperatureSetting + " °C");
        System.out.println("Current Temperature: " + currentTemperature + " °C");
        System.out.println("Heating/Cooling: " + 
            (currentTemperature < temperatureSetting ? "Heating" : 
             currentTemperature > temperatureSetting ? "Cooling" : "Idle"));
        System.out.println("------------------------");
    }
}
