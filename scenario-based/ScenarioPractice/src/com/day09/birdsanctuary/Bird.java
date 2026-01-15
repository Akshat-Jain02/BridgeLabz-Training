package com.day09.birdsanctuary;

abstract class Bird {
    private String name;
    private String species;
    private String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " (" + species + ") is eating...");
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}