package com.day01.smarthomeautomationsystem;
public class Fan extends Appliance implements Adjustable {
    private int speed; // 1–5

    public Fan(String name) {
        super(name);
        this.speed = 1;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " fan is ON");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " fan is OFF");
    }

    @Override
    public void adjust(int value) {
        speed = value;
        System.out.println(getName() + " fan speed set to " + speed);
    }
}
