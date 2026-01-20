package com.day11.addressbooksystem;

public class AddressBookSystem {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Address addr1 = new Address("Delhi", "Delhi", "110001");
        Address addr2 = new Address("Mumbai", "Maharashtra", "400001");

        Contact c1 = new Contact(
                "Akshat", "Jain",
                "9999999999",
                "akshat@gmail.com",
                addr1
        );

        Contact c2 = new Contact(
                "Ravi", "Sharma",
                "8888888888",
                "ravi@gmail.com",
                addr2
        );

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        System.out.println("\nAll Contacts:");
        addressBook.displayAllContacts();

        System.out.println("\nSearch by City (Delhi):");
        addressBook.searchByCity("Delhi");

        System.out.println("\nEditing Contact:");
        addressBook.editContact("Akshat Jain", "7777777777", "akshat_new@gmail.com");

        System.out.println("\nAfter Edit:");
        addressBook.displayAllContacts();

        System.out.println("\nDeleting Contact:");
        addressBook.deleteContact("Ravi Sharma");

        System.out.println("\nFinal List:");
        addressBook.displayAllContacts();
    }
}
