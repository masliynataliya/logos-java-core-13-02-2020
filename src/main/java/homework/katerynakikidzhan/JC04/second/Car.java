package homework.katerynakikidzhan.JC04.second;

import java.util.Scanner;

// Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними.
// Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу.
// Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters, toString).
// Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об"єкт Машина, запустити всі його методи.
public class Car {
    private String colour;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private Body body;

    public Car() {
        this.colour = "aqua";
        this.steeringWheel = new SteeringWheel();
        this.wheel = new Wheel();
        this.body = new Body();
    }

    public Car(String colour, SteeringWheel steeringWheel, Wheel wheel, Body body) {
        this.colour = colour;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.body = body;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", steeringWheel=" + steeringWheel +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }

    public void changeColour() {
        System.out.println("Enter your colour.");
        Scanner sc = new Scanner(System.in);
        colour = sc.nextLine();
    }
}