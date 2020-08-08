package homework.denysyerchenko.lesson11;

import java.util.Arrays;
import java.util.Random;

public class IntegerArray {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        Random r = new Random();
        Integer[] randomIntegers = new Integer[10];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = (r.nextInt((max - min) + 1) + min);
            System.out.println(randomIntegers);

        }
    }
}


