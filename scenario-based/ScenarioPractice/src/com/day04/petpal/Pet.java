package com.day04.petpal;

import java.util.Random;

class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 (full) to 100 (hungry)
    private int mood;     // 0 (sad) to 100 (happy)
    private int energy;   // internal state

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50);
        this.mood = rand.nextInt(50) + 50;
        this.energy = rand.nextInt(50) + 50;
    }

    // Constructor with user-specified values
    public Pet(String name, String type, int age, int hunger, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = 50;
    }

    public void makeSound() {
        System.out.println("Pet makes a sound");
    }

    @Override
    public void feed() {
        hunger -= 10;
        energy += 5;
        System.out.println(name + " has been fed");
    }

    @Override
    public void play() {
        mood += 10;
        hunger += 5;
        energy -= 10;
        System.out.println(name + " is playing");
    }

    @Override
    public void sleep() {
        energy += 15;
        hunger += 5;
        System.out.println(name + " is sleeping");
    }

    public int getMood() {
        return mood;
    }
}
