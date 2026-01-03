package com.day01.smarthomeautomationsystem;

public abstract class Appliance {
    private String name;
    private boolean isOn;

    public Appliance(String name) {
        this.name = name;
        this.isOn = false;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    protected void setOn(boolean status) {
        this.isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }
}
