package homework.katerynakikidzhan.JC04.second;

import java.util.Scanner;

// Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними.
// Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу.
// Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters, toString).
// Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об"єкт Машина, запустити всі його методи.
public class SteeringWheel {
    private int d;
    private String colour;


    public SteeringWheel() {
        this.colour = "black";
        this.d = 10;
    }

    public SteeringWheel(int d, String colour) {
        this.colour = colour;
        this.d = d;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "d=" + d +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void changeD() {
        d *= 2;
    }

    public void changeColour() {
        System.out.println("Enter your colour.");
        Scanner sc = new Scanner(System.in);
        colour = sc.nextLine();
    }
}
