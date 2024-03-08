package org.example;

import org.Models.Telephone;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Telephone telephoneBook = new Telephone();
        boolean running = true;
        while (running) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(telephoneBook.scanner.nextLine());
            switch (choice) {
                case 1:
                    telephoneBook.addContact();
                    break;
                case 2:
                    telephoneBook.viewContacts();
                    break;
                case 3:
                    telephoneBook.updateContact();
                    break;
                case 4:
                    telephoneBook.deleteContact();
                    break;
                case 5:
                    telephoneBook.close();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}