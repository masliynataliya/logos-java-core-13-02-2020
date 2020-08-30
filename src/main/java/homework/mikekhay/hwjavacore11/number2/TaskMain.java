package homework.mikekhay.hwjavacore11.number2;

import java.util.Arrays;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Car car = new Car(new Engine(),new Kermo());

        System.out.println("Виберіть опцію.");
        System.out.println("1.Вивести елементи масиву в консоль.");
        System.out.println("2.Заповнити один автомобіль.");

        Scanner sc = new Scanner(System.in);
        Car[][] randomCar = carArrays();

        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println(Arrays.deepToString(randomCar));
                carArrays();
                break;

            case 2:
                for (int i = 0; i < randomCar.length; i++) {
                    Arrays.fill(randomCar[i], car);
                }
                System.out.println(Arrays.deepToString(randomCar));
                break;

            default:
                System.out.println("Такої опції не існує.");
        }
    }

    private static Car[][] carArrays() {
        int randomArraysSize1 = 1 + (int) ( Math.random() * 4 );
        int randomArraysSize2 = 1 + (int) ( Math.random() * 4 );
        Car[][] car = new Car[randomArraysSize1][randomArraysSize2];

            for (int i = 0; i < car.length; i++){
                for (int e = 0; e < car[i].length; e++){
                    car[i][e] = new Car(new Engine(),new Kermo());
                }
            }
        return car;
    }
}
