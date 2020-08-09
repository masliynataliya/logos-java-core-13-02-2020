package homework.romanivanov.javacore.jc11hw.intExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IntegerExample {
    public static void main(String[] args) {
        Integer[] array = random();
        Arrays.sort(array);
        System.out.println("Array from min to max: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array from max to min: " + Arrays.toString(array));
    }

    public static Integer[] random() {
        Random random = new Random();
        Integer[] array = new Integer[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
        }
        return array;
    }
}
