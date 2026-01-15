package com.day09.birdsanctuary;

class Seagull extends Bird implements Flyable, Swimmable {
    public Seagull(String name, String id) {
        super(name, "Seagull", id);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying over the sea...");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming on the surface...");
    }
}