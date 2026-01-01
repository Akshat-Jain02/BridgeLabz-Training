package com.inheritance.hierarchical.animalhierarchy;

public class Bird extends Animal {
	public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet! Chirp!");
    }
}
