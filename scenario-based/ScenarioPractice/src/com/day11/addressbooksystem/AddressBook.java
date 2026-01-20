package com.day11.addressbooksystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate check
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact found!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String fullName, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String fullName) {
        contacts.removeIf(c ->
                c.getFullName().equalsIgnoreCase(fullName));
        System.out.println("Contact deleted if existed.");
    }

    // Search by city
    public void searchByCity(String city) {
        contacts.stream()
                .filter(c -> c.getAddress() != null &&
                             c.getAddress().getCity().equalsIgnoreCase(city))
                .forEach(System.out::println);
    }

    // Search by state
    public void searchByState(String state) {
        contacts.stream()
                .filter(c -> c.getAddress() != null &&
                             c.getAddress().getState().equalsIgnoreCase(state))
                .forEach(System.out::println);
    }

    // Display all sorted contacts
    public void displayAllContacts() {
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .forEach(System.out::println);
    }
}
