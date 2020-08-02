package homework.mikekhay.hwjavacore10.number1;

import java.util.Scanner;

public class Politurne {
    public Politurne() {
    }

    public static void main(String[] args) {
        System.out.println("Введіть слово.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        if (5 == text.length()) {
            System.out.println("Дане слово складається з 5 букв.");
        } else System.out.println("Помилка. Дане слово складається не з 5 букв.");

        if(text.equals(new StringBuilder(text).reverse().toString())){
            System.out.println("Дане слово є паліндромом.");
        } else {
            System.out.println("Дане слово не є паліндромом. Або введено не коректні дані.");
        }

    }
}


