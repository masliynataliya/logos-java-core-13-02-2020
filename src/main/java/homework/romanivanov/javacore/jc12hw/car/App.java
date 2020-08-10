package homework.romanivanov.javacore.jc12hw.car;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new SteeringWheel());
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Car>> randomCars = new ArrayList<>();
        boolean go = true;


        while (go) {

            int choose = sc.nextInt();
            System.out.println("Choose option");
            info();
            if (choose > 1 & choose < 5) {

                switch (choose) {
                    case 1:
                        randomCars = randomizeArrayCars(1, 3);
                        System.out.println(randomCars.toString());
                        break;
                    case 2:
                        replaceAllCarsToOneCarType(car, randomCars);
                        randomCars = randomizeArrayCars(1, 3);
                        break;
                    case 3:
                        info();
                        break;
                    case 4:
                        go = false;
                        break;

                }
            }
            else {
                System.out.println("Choose correct answer");
                go = false;
            }
        }
    }

    private static void replaceAllCarsToOneCarType(Car car, ArrayList<ArrayList<Car>> cars) {
        cars.forEach(cars1 -> {
            cars1.replaceAll(car1 -> car);
        });
        // ForEach - звичайний foreach
        //cars 1 - Ліст, фігурна душка - означає що всередині нічого не поверне.
        // replaceAll(car1 -> car) - робить заміну всіх car на car1
        System.out.println(cars);
    }

    private static ArrayList<ArrayList<Car>> randomizeArrayCars(int min, int max) {
        int rndOuter = HelpTools.rnd(min, max);
        int rndInner = HelpTools.rnd(min, max);
        ArrayList<ArrayList<Car>> outerCars = new ArrayList<>(rndOuter);
        for (int i = 0; i < rndOuter; i++) {
            ArrayList<Car> innerCars = new ArrayList<>(rndInner);
            for (int j = 0; j < rndInner; j++) {
                innerCars.add(j, new Car(new Engine(), new SteeringWheel()));
            }
            outerCars.add(i, innerCars);
        }
        return outerCars;
    }

    private static void info() {
        System.out.println("Press '1' to generate random array");
        System.out.println("Press '2' to fill one Car to all object");
        System.out.println("press '3' to get info");
        System.out.println("Press '4' to end program");
    }

}







