package homework.romanivanov.javacore.jc12hw.classWork;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        boolean go = true;
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        phoneBook.info();
        while (go) {
            phoneBook.chooseOption();
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    phoneBook.addPerson();
                    break;
                case 2:
                    phoneBook.findAllPersons();
                    break;
                case 3:
                    phoneBook.deleteByName();
                    break;
                case 4:
                    phoneBook.deleteByNumber();
                    break;
                case 5:
                    phoneBook.info();
                    break;
                case 6:
                    go = false;
                    break;


            }


        }


    }
}
