package homework.ihorpayensky.homeworks.homework11.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        Random r = new Random();
        Integer[] array = new Integer[10];
        int max = 999;
        int min = 100;

        for (int i = 0; i < array.length; i++)
            array[i] = r.nextInt(max - min + 1) + min;

        System.out.println("Random array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array < : " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted array > : " + Arrays.toString(array));

    }
}
