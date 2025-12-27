package com.constructors.levelone;

public class Circle {
	 double radius;

	    // Default constructor
	    Circle() {
	        this(1.0);   // constructor chaining
	    }

	    // Parameterized constructor
	    Circle(double radius) {
	        this.radius = radius;
	    }

	    double area() {
	        return Math.PI * radius * radius;
	    }

	    public static void main(String[] args) {
	        Circle c1 = new Circle();
	        Circle c2 = new Circle(5);

	        System.out.println("Default radius area: " + c1.area());
	        System.out.println("Custom radius area: " + c2.area());
	    }
}
