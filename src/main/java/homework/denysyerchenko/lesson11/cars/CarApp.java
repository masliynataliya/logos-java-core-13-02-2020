package homework.denysyerchenko.lesson11.cars;
import java.util.Arrays;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car [][] cars = {{car1,car2,car3},{car4,car5,car6}};
        System.out.println(Arrays.deepToString(cars));
        for (Car[] row : cars)
        Arrays.fill(row, car1);
        System.out.println(Arrays.deepToString(cars));

        }
    }
