package com.day09.birdsanctuary;

class Eagle extends Bird implements Flyable {
    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high...");
    }
}