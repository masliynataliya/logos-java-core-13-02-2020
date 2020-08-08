package homework.denysyerchenko.lesson11;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            {
                {

                    System.out.println("Welcome to the phone book application");
                    System.out.println("Press 1 to see your contacts");
                    System.out.println("Press 2 to add a new contact");
                    System.out.println("Press 3 to delete a contact by name");
                    System.out.println("Press 4 to delete a contact by number");
                    System.out.println("Press 5 to close the phone book application");


                    Scanner optionScanner = new Scanner(System.in);
                    int desiredOption = optionScanner.nextInt();

                    switch (desiredOption) {
                        case 1:
                            System.out.println(contacts.toString());
                            break;
                        case 2:
                            System.out.println("Enter the name: ");
                            String newContactName = optionScanner.next();
                            System.out.println("Enter the number: ");
                            String newContactNumber = optionScanner.next();
                            Contact newContact = new Contact(newContactName, newContactNumber);
                            contacts.add(newContact);
                            System.out.println("The new contact added successfully");
                            break;
                        case 3:
                            System.out.println("Enter the name" + optionScanner.nextLine());
                            String contactNameToDelete = optionScanner.nextLine();
                            for (int i = 0; i < contacts.size(); i++) {
                                if (contacts.get(i).getContactName().equalsIgnoreCase(contactNameToDelete)) {
                                    contacts.remove(i);
                                    System.out.println("The contact deleted successfully");
                                    break;
                                }
                                else {
                                    System.out.println("The name is not found");
                                }
                            }
                        case 4:
                            System.out.println("Enter the number" + optionScanner.nextLine());
                            String contactNumberToDelete = optionScanner.nextLine();
                            for (int j = 0; j < contacts.size(); j++) {
                                if (contacts.get(j).getPhoneNumber().equalsIgnoreCase(contactNumberToDelete)) {
                                    contacts.remove(j);
                                    System.out.println("The contact deleted successfully");
                                    break;
                                }
                                else {
                                    System.out.println("The number is not found");
                                }
                            }
                        case 5:
                            System.out.println("The phone book application is closed");
                            System.exit(0);
                    }
                    System.out.println();
                }
            }
        }
    }
}