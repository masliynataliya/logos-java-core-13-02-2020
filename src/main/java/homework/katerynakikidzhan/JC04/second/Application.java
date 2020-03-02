package homework.katerynakikidzhan.JC04.second;

// Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними.
// Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу.
// Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters, toString).
// Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об"єкт Машина, запустити всі його методи.
public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());

        Car car2 = new Car(
                "yellow",
                new SteeringWheel(20, "red"),
                new Wheel(30, "green"),
                new Body(50, "white")
        );
        System.out.println(car2.toString() + "\n");

        car2.changeColour();
        System.out.println(car2.toString());
    }
}
