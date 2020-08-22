package homework.markoTolochko.lesson11Car;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Car[][] arr = new Car[random.nextInt(10)][random.nextInt(10)];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[0].length; i1++) {
                arr[i][i1] = new Car();
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
