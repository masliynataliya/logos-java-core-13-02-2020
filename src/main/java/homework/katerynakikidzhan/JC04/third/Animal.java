package homework.katerynakikidzhan.JC04.third;

import java.util.Scanner;

// Створити клас Тварина. Описати його такими полями: назва тварини , швидкість тварини, вік тварини.
// Дані поля помічені модифікатором доступу private.
// Створити конструктор з визначеними параметрами, в який необхідно ввести всі поля класу.
// Створити getters/setters до всіх полів класу.
// В методі мейн Створити екземпляр даного класу, за допомогою getter вивести на консоль в один рядок значення полів даного класу.
// Викликати setter, змінити значеннявсіх полів класу. Вивести на консоль всі поля класу, знову в один рядок.
//  Значення полів довільні на Ваш розсуд. В методі мейн повинен бути створенийлише один обєкт класу Тварина.
//  Вивід повинен бути написаний наступним чином:
// "Назва тварини = Леопард, Швидкість тварини = 20 км/год, Вік тварини = 7 років " "--------"
// "Назва тварини = Бик, Швидкість тварини = 2 км/год, Вік тварини = 14 років "
public class Animal {
    private int speed;
    private String species;
    private int age;

    Scanner sc = new Scanner(System.in);

//        System.out.println("Enter speed.");
//        this.speed = sc.nextInt();
//        System.out.println("Enter age.");
//        this.age = sc.nextInt();
//        System.out.println("Enter species");
//        this.species = sc.nextLine();

    public Animal() {
        this.speed = 34;
        this.species = "unicorn";
        this.age = 12;
    }

    public Animal(int speed, String species, int age) {
        this.speed = speed;
        this.species = species;
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
