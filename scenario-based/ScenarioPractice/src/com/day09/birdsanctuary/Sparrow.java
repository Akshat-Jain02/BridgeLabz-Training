package com.day09.birdsanctuary;

class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, String id) {
        super(name, "Sparrow", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying swiftly...");
    }
}