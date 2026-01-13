package com.day02.traincompanion;

class Compartment {
    String name;           
    boolean hasWiFi;
    boolean hasPantry;
    Compartment prev;
    Compartment next;

    public Compartment(String name, boolean hasWiFi, boolean hasPantry) {
        this.name = name;
        this.hasWiFi = hasWiFi;
        this.hasPantry = hasPantry;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return name + (hasWiFi ? " [WiFi]" : "") + (hasPantry ? " [Pantry]" : "");
    }
}