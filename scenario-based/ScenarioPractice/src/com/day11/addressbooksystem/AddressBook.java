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
        for (Contact c : contacts) {
            if (c.getAddress() != null && 
                c.getAddress().getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    // Search by state
    public void searchByState(String state) {
        for (Contact c : contacts) {
            if (c.getAddress() != null && 
                c.getAddress().getState().equalsIgnoreCase(state)) {
                System.out.println(c);
            }
        }
    }

    // Display all sorted contacts
    public void displayAllContacts() {
        // Create a copy so we don't modify original list
        List<Contact> sortedList = new ArrayList<>(contacts);
        
        // Sort using Collections.sort (since we removed stream)
        java.util.Collections.sort(sortedList, Comparator.comparing(Contact::getFullName));
        
        for (Contact c : sortedList) {
            System.out.println(c);
        }
    }
}