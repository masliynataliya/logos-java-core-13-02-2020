package homework.romanivanov.javacore.jc11hw;

import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new SteeringWheel());
        Scanner sc = new Scanner(System.in);
        boolean go = true;


        Car[][] randomCars = carArrays();


        while (go) {
            info();
            System.out.println("Choose option");
            int choose = sc.nextInt();
                switch  (choose) {
                    case 1:

                        System.out.println(Arrays.deepToString(randomCars));
                        randomCars = carArrays();
                        break;
                    case 2:

                        randomCarArrayToOneCarTypeArray(car, randomCars);
                        randomCars = carArrays();
                        break;
                    case 3:
                        info();
                        break;

                    case 4:
                       System.exit(0);
                        break;
                    default:
                        System.out.println("Введіть правильний номер операції");
                }


            }

        }



    private static void randomCarArrayToOneCarTypeArray(Car car, Car[][] randomCars) {
        for (int i = 0; i < randomCars.length; i++) {
            Arrays.fill(randomCars[i], car);

        }
        System.out.println(Arrays.deepToString(randomCars));
    }

    private static Car[][] carArrays() {
        int randomArraySize1 = HelpTools.rnd(1, 4);
        int randomArraySize2 = HelpTools.rnd(1, 4);
        Car[][] cars = new Car[randomArraySize1][randomArraySize2];


        for (int i = 0; i < cars.length; i++) {

            for (int j = 0; j < cars[i].length; j++) {
                cars[i][j] = new Car(new Engine(), new SteeringWheel());
            }
        }


        return cars;
    }

    private static void info() {
        System.out.println("Press '1' to generate random array");
        System.out.println("Press '2' to fill one Car to all object");
        System.out.println("Press '3' to get info");
        System.out.println("Press'4' to end program");
    }


}
