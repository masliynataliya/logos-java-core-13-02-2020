package homework.markoTolochko.lesson12CarArray;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < random.nextInt(3); i++){
            cars.add(new Car());
        }
        System.out.println(cars);

    }
}
