package com.day04.petpal;

public class PetPal {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Luna", 2);
        Pet bird = new Bird("Kiwi", 1);

        dog.makeSound();
        dog.feed();
        dog.play();

        cat.makeSound();
        cat.sleep();

        bird.makeSound();
        bird.play();

        System.out.println("Dog mood level: " + dog.getMood());
    }
}
