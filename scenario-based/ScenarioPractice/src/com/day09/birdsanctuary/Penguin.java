package com.day09.birdsanctuary;

class Penguin extends Bird implements Swimmable {
    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming underwater...");
    }
}