package homework.romanivanov.javacore.jc12hw.classWork;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    ArrayList<Person> person = new ArrayList<Person>();


    public Person addPerson() {
        Scanner sc = new Scanner(System.in);
        Person per = new Person();
        System.out.println("Set Name");
        per.setName(sc.nextLine());
        System.out.println("Set Number");
        per.setNumber(sc.nextInt());
        person.add(per);
        System.out.println("You successfully add new Contact");
        return per;
    }

    public void chooseOption() {
        System.out.println("Choose option");


    }

    public void findAllPersons() {
        System.out.println("\n"+ person);

    }

    public void deleteByNumber() {
        Scanner sc = new Scanner(System.in);
        boolean yes = false;
        System.out.println("Type number of contact");
        int number = sc.nextInt();
        for (int i = 0; i < person.size(); i++) {
            if (number == person.get(i).getNumber()) {
                person.remove(i);
                System.out.println("Contact(s) deleted");
                yes = true;
            }
            if (!yes) {
                System.out.println("Contact(s) by this name not found");
            }
        }
    }

    public void deleteByName() {
        Scanner sc = new Scanner(System.in);
        boolean yes = false;
        System.out.println("Type name of contact");
        String name = sc.nextLine();
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getName().equalsIgnoreCase(name)) {
                person.remove(i);
                System.out.println("Contact(c) deleted");
                yes = true;
            }
        }
        if (!yes) {
            System.out.println("Contact(s) by this name not found");
        }
    }
    public void info(){
        System.out.println("type 1 to add contact");
        System.out.println("type 2 to view all contacts");
        System.out.println("type 3 to delete contact");
        System.out.println("type 4 to delete contact by number");
        System.out.println("type 5 to info");
        System.out.println("type 6 to end program");
    }

}

