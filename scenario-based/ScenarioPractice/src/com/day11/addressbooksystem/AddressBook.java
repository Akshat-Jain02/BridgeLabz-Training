package com.day11.addressbooksystem;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<Contact>();

    // Add contact with duplicate check
    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = (Contact) contacts.get(i);
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
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = (Contact) contacts.get(i);
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name - manual loop + create new list
    public void deleteContact(String fullName) {
        List<Contact> newList = new ArrayList<Contact>();
        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            Contact c = (Contact) contacts.get(i);
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                found = true;
                // skip adding this contact → effectively deleted
            } else {
                newList.add(c);
            }
        }

        contacts = newList;  // replace old list with new one

        if (found) {
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Search by city
    public void searchByCity(String city) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = (Contact) contacts.get(i);
            if (c.getAddress() != null && 
                c.getAddress().getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    // Search by state
    public void searchByState(String state) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = (Contact) contacts.get(i);
            if (c.getAddress() != null && 
                c.getAddress().getState().equalsIgnoreCase(state)) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts sorted by name (manual bubble sort)
    public void displayAllContacts() {
        // Make a copy of the list
        List<Contact> listToSort = new ArrayList<Contact>();
        for (int i = 0; i < contacts.size(); i++) {
            listToSort.add((Contact) contacts.get(i));
        }

        // Bubble sort (very basic sorting - no Comparator, no Collections)
        for (int i = 0; i < listToSort.size() - 1; i++) {
            for (int j = 0; j < listToSort.size() - 1 - i; j++) {
                Contact c1 = (Contact) listToSort.get(j);
                Contact c2 = (Contact) listToSort.get(j + 1);

                // Compare ignoring case
                if (c1.getFullName().compareToIgnoreCase(c2.getFullName()) > 0) {
                    // Swap
                    listToSort.set(j, c2);
                    listToSort.set(j + 1, c1);
                }
            }
        }

        // Print the sorted list
        for (int i = 0; i < listToSort.size(); i++) {
            System.out.println(listToSort.get(i));
        }
    }
}