package com.constructors.levelone;

public class Person {
	  String name;
	    int age;

	    // Parameterized constructor
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Copy constructor
	    Person(Person p) {
	        this.name = p.name;
	        this.age = p.age;
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Original object to be copied
	        Person p1 = new Person("Rahul", 22);

	        // Clone object using copy constructor
	        Person p2 = new Person(p1);

	        //Displaying the final result
	        System.out.println("Original Person:");
	        p1.display();

	        System.out.println("Cloned Person:");
	        p2.display();
	    }
}
