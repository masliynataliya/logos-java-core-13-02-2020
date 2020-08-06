package homework.romanivanov.javacore.jc11hw.intExample;

import java.util.Arrays;
import java.util.Collections;

public class IntegerExample {
    public static void main(String[] args) {
        Integer[] array = {24, 106, 34, -2, -34, -1, 0, 65};
        Arrays.sort(array);
        System.out.println("Array from min to max: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array from max to min: " + Arrays.toString(array));
    }
}
