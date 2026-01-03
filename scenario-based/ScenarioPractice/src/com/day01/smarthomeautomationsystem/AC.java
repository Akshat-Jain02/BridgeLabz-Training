package com.day01.smarthomeautomationsystem;
public class AC extends Appliance implements Adjustable {
    private int temperature; // 16–30

    public AC(String name) {
        super(name);
        this.temperature = 24;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " AC is ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " AC is OFF");
    }

    @Override
    public void adjust(int value) {
        temperature = value;
        System.out.println(getName() + " temperature set to " + temperature + "°C");
    }
}
