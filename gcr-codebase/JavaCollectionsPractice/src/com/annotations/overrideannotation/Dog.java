package com.annotations.overrideannotation;

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
