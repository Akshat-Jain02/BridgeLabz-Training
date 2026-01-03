package com.day01.smarthomeautomationsystem;

public class Light extends Appliance implements Adjustable {
    private int brightness; // 0–100

    public Light(String name) {
        super(name);
        this.brightness = 50;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " light is ON");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " light is OFF");
    }

    @Override
    public void adjust(int value) {
        brightness = value;
        System.out.println(getName() + " brightness set to " + brightness);
    }
}
