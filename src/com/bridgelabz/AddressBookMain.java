package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Contacts contacts = addressBook.addContacts();
        addressBook.showContacts(contacts);
    }

}
