package homework.katerynakikidzhan.JC04.third;
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
public class Application {
    public static void main(String[] args) {
        Animal animal = new Animal(14, "cat", 11);

        if (animal.getAge() % 10 == 1) {
            System.out.printf("Species = %s. Speed = %d km/h. Age = %d year.%n", animal.getSpecies(), animal.getSpeed(), animal.getAge());
        } else {
            System.out.printf("Species = %s. Speed = %d km/h. Age = %d years.%n", animal.getSpecies(), animal.getSpeed(), animal.getAge());
        }

        animal.setSpecies("Hippo");
        animal.setSpeed(12);
        animal.setAge(4);

        if (animal.getAge() % 10 == 1) {
            System.out.printf("Species = %s. Speed = %d km/h. Age = %d year.%n", animal.getSpecies(), animal.getSpeed(), animal.getAge());
        } else {
            System.out.printf("Species = %s. Speed = %d km/h. Age = %d years.%n", animal.getSpecies(), animal.getSpeed(), animal.getAge());
        }
    }
}
