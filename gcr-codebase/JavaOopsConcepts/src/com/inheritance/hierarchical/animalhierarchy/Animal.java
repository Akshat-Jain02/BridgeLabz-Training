package com.inheritance.hierarchical.animalhierarchy;

public class Animal {
	
	private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}
