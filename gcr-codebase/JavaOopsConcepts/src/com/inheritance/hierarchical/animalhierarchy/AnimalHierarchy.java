package com.inheritance.hierarchical.animalhierarchy;

public class AnimalHierarchy {
	public static void main(String[] args) {
        // Create instances
        Animal dog = new Dog("Buddy", 5);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety", 2);
        Animal genericAnimal = new Animal("Unknown", 10);

        System.out.println("Individual tests:");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        genericAnimal.makeSound();

        System.out.println("\n" + "=".repeat(40));

        // Polymorphism: Store different animals in an array
        System.out.println("Demonstrating polymorphism:\n");
        Animal[] animals = {dog, cat, bird, genericAnimal};
        
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
