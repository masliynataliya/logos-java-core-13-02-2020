package homework.markoTolochko.lesson11ArraySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IntegerArraySorting {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] integerArray = new Integer[10];
        for (int i = 0; i < 10; i++){
            integerArray[i]=random.nextInt(50);
        }

        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));
        System.out.println();

        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArray));
        System.out.println();
    }
}
