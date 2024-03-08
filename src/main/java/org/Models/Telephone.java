package org.Models;
import java.util.ArrayList;
import java.util.Scanner;

public class Telephone {
    private ArrayList<Contact> contacts;
    public Scanner scanner;

    public Telephone() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void updateContact() {
        System.out.print("Enter name of contact to update: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Enter new email: ");
                String email = scanner.nextLine();

                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact() {
        System.out.print("Enter name of contact to delete: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void close() {
        scanner.close();
    }


}
