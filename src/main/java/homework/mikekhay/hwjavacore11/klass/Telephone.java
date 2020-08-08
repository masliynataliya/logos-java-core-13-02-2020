package homework.mikekhay.hwjavacore11.klass;

import java.util.ArrayList;
import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList();

        while (true) {
            System.out.println("Виберіть опцію");
            System.out.println("1.Переглянути телефону книгу");
            System.out.println("2.Додати контакт");
            System.out.println("3.Видалити контакт за іменем");
            System.out.println("4.Видалити контакт за номером");
            System.out.println("5.Вийти з програми");

            Scanner sc = new Scanner(System.in);
            String option = sc.next();

            switch (option) {
                case "1":
                    System.out.println("Переглянути телефону книгу");
                    System.out.println(list);
                    System.out.println();

                    break;
                case "2":
                    System.out.println("Введіть Імя");
                    String name = sc.next();
                    System.out.println("Введіть Номер");
                    String number = sc.next();
                    Person person = new Person(name,number);
                    list.add(person);

                    break;
                case "3":
                    System.out.println("Введіть імя по якому видати інформацію.");
                    String delName = sc.next();
                    for (int i =0;i<list.size();i++){
                        Person p1 = list.get(i);
                        if (p1.getName().equals(delName)){
                            list.remove(i);
                        }
                    }

                    break;
                case "4":
                    System.out.println("Введіть номер телефону по якому видалити інформацію.");
                    String delNumber = sc.next();
                    for (int i = 0;i<list.size();i++){
                        Person p1 = list.get(i);
                        if (p1.getNumber().equals(delNumber)){
                            list.remove(i);
                        }
                    }

                    break;
                case "5":
                    System.out.println("Програма завершила роботу.");
                    System.exit(0);
            }
        }
    }
}

