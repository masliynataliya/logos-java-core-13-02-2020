package homework.ihorpayensky.homeworks.homework10.minplan.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            StringBuilder str = new StringBuilder(5);
            System.out.print("Введіть слово: ");
            str.append(new Scanner(System.in).nextLine());
            if (str.capacity() != 5) throw new Exception();

            boolean b = str.toString().equalsIgnoreCase(str.reverse().toString());
            System.out.println("Слово " + str.toString() + (b ? " є " : " не є ") + "паліндромом!");

        } catch (Exception e) {
            System.out.println("Слово не є з 5-ти букв!...");
        }
    }
}
