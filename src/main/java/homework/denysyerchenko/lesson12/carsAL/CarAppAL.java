package homework.denysyerchenko.lesson12.carsAL;

import homework.denysyerchenko.lesson11.cars.Car;

import java.util.ArrayList;

public class CarAppAL {
    public static void main(String[] args) {
        ArrayList<homework.denysyerchenko.lesson11.cars.Car> carsList = new ArrayList<>();
        carsList.add(new homework.denysyerchenko.lesson11.cars.Car());
        carsList.add(new homework.denysyerchenko.lesson11.cars.Car());
        carsList.add(new homework.denysyerchenko.lesson11.cars.Car());
        carsList.add(new homework.denysyerchenko.lesson11.cars.Car());
        carsList.add(new homework.denysyerchenko.lesson11.cars.Car());
        carsList.add(new Car());
        System.out.println(carsList);
        carsList.replaceAll(e -> carsList.get(0));
        System.out.println(carsList);
    }
}
