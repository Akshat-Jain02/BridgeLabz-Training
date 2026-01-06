package com.day03.campusconnect;

class Person {
	
    protected String name;
    protected String email;
    protected String id;

    public Person(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    // Polymorphic method - will be overridden
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}