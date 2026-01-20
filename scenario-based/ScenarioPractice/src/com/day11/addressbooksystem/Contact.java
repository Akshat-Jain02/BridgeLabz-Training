package com.day11.addressbooksystem;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName,
                   String phoneNumber, String email,
                   Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " | " + phoneNumber + " | " + email +
               " | " + (address != null ? address : "No Address");
    }
}
