package homework.didukhigor.homework.javacore4.car;

import java.awt.*;
import java.util.concurrent.Callable;

import static java.awt.Color.black;
import static java.awt.Color.red;

public class CarMain {
    public static void main(String[] args) {

     Car car = new Car();
     System.out.println(car.toString());

     Car car1 = new Car();
             car1.setColor("colorful");
             car1.setBody(5,"wood");
             car1.setHelm(42,"pink");
             car1.setWheel(66,"purple");


        System.out.println(car1.toString());
    };
};


