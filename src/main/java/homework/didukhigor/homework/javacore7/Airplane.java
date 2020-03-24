package homework.didukhigor.homework.javacore7;

import java.util.Random;

//Створити Абстрактний клас Літак який матиме методи:
//o ЗапускДвигунів , який буде виводити на екран скільки часу залишилось до готовності влетіти, де час генерується випадково в межах від [20,88].
//o ВзлітЛітака, який виводитиме скільки проїде літак кілометрів на повному баку палива. Генеруємо випадкове дробове число від нуля до 1000
//o ПосадкаЛітака, який виводитиме на екран що літак іде на посадку.
//Описати габарити літака в полях даного класу. (Довжина, ширина, вага,). Створити конструктор даного класу , куди передати дані поля.
public abstract class Airplane {

    Random random = new Random();

    private double length;
    private double width;
    private int weight;

    public void startingEngines(){
        int timeToStart = 20+random.nextInt(89-20);
        System.out.println("Time to start is: "+timeToStart+"min.");
    }
    public void flightRangeAirplane() {
        double flightRange = random.nextDouble();
        System.out.println("The airplane will fly "+flightRange+" km.");
    }
    public void thePlaneLands(){
        System.out.println("The plane lands.");
    }

    public Airplane(double length, double width, int weight) {
        this.length = 18.5;
        this.width = 12.7;
        this.weight = 18000;
    }

}
