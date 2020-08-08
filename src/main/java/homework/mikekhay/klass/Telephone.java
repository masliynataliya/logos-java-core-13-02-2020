package homework.mikekhay.klass;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Виберіть опцію");
            System.out.println("1.Переглянути телефону книгу");
            System.out.println("2.Додати контакт");
            System.out.println("3.Видалити контакт за іменем");
            System.out.println("4.Видалити контакт за номером");
            System.out.println("5.Вийти з програми");

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Переглянути телефону книгу");

                    break;
                case "2":
                    System.out.println("Введіть Імя");
                    Scanner namee = new Scanner(System.in);
                    String name = namee.nextLine();
                    System.out.println("Введіть Номер");
                    Scanner numberr = new Scanner(System.in);
                    int number = numberr.nextInt();
                    Persons persons = new Persons();
                    break;
                case "3":
                    System.out.println("Введіть імя по якому видати інформацію.");

                    break;
                case "4":
                    System.out.println("Введіть номер телефону по якому видалити інформацію.");

                    break;
                case "5":
                    System.out.println("Програма завершила роботу.");
                    System.exit(5);
            }
        }
    }
}

