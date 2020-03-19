package homework.didukhigor.homework.javacore6.my_calculator;
//Створіть інтерфейс Plus, з методoм : додати; Minus, з методoм : відняти; Multiply з методoм : помножити;
// Devide з методoм : поділити; створіть інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus,
// Minus, Multiply, Devide в пакеті com.lgs.lab.interface1.
// Створіть пакет com.lgs.lab.interface2 в якому створіть клас MyCalculator
// і заімплементіть даному класу інтерфейс Numerable та задайте реалізацію всім методам даного інтерфейсу.
// Створіть метод мейн та створіть об’єкт класу MyCalculator , до якоо викличте всі його методи .
// Результати арифметичних операцій виведіть на консоль

public class MyCalculator implements Numerable {


    @Override
    public void divide(double x,double y) {
        double d=x/y;
        System.out.println(d);
    }

    @Override
    public void minus(double x,double y) {
        double m=x-y;
        System.out.println(m);
    }

    @Override
    public void multiply(double x,double y) {
        double mult=x*y;
        System.out.println(mult);
    }

    @Override
    public void plus(double x,double y) {
        double p=x+y;
        System.out.println(p);
    }
}
