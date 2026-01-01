package com.inheritance.single.smarthomedevices;

public class Device {
	protected String deviceId;
    protected boolean status;  // true = on, false = off

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
        System.out.println("Type: Generic Device");
        System.out.println("------------------------");
    }
}
