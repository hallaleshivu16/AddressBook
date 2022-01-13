package com.bridgelabz;

import java.util.Scanner;
import java.util.SortedMap;

public class AddressBook {
    private Scanner sc = new Scanner(System.in);

    public Contacts addContacts (){
        Contacts contacts = new Contacts();
        System.out.println("Enter the First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter the LAst Name");
        String lastName = sc.nextLine();
        System.out.println( "Enter the Address");
        String address = sc.nextLine();
        System.out.println("Enter the City");
        String city = sc.nextLine();
        System.out.println("Enter the Email ID");
        String emailID = sc.nextLine();
        System.out.println("Enter the State");
        String state = sc.nextLine();
        System.out.println("Enter the Zip");
        String zip = sc.nextLine();
        System.out.println("Enter the Mobile Number");
        String mobileNo = sc.nextLine();
        contacts.setFirstName(firstName);
        contacts.setLastName(lastName);
        contacts.setAddress(address);
        contacts.setCity(city);
        contacts.setEmailId(emailID);
        contacts.setState(state);
        contacts.setZip(zip);
        contacts.setMobileNo(mobileNo);
        return contacts;
    }
    public void showContacts(Contacts contacts){
        System.out.println("Firat Name: " +  contacts.getFirstName());
        System.out.println("Last Name: " +  contacts.getLastName());
        System.out.println("Address: " +  contacts.getAddress());
        System.out.println("City: " +  contacts.getCity());
        System.out.println("Email ID: " +  contacts.getEmailId());
        System.out.println("State: " +  contacts.getState());
        System.out.println("Zip: " +  contacts.getZip());
        System.out.println("Mobile Number: " +  contacts.getMobileNo());
    }


}
