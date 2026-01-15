package com.day09.birdsanctuary;
class Duck extends Bird implements Swimmable {
    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming gracefully...");
    }
}