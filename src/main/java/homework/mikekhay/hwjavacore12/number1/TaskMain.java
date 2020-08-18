package homework.mikekhay.hwjavacore12.number1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        System.out.println(cars.toString());

        for(int i = 0; i < ((int) ( Math.random() * 5 )+2);i++){
            cars.add(new Car());
        }

        System.out.println("Виберіть опцію.");
        System.out.println("1.Вивести елементи масиву в консоль.");
        System.out.println("2.Заповнити один автомобіль.");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println(cars.toString());
                System.out.println();
                break;

            case 2:
                Car car = new Car();
                System.out.println(car.toString());
                cars.replaceAll(c -> car);
                System.out.println();
            default:
                System.out.println("Такої опції не існує.");
        }
    }
}