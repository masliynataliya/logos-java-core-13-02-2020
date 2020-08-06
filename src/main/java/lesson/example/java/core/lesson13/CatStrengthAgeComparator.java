package lesson.example.java.core.lesson13;

import java.util.Comparator;
import java.util.stream.Collector;

public class CatStrengthAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat firstCat, Cat secondCat) {
        float firstCatStrength = firstCat.getStrength();
        float secondCatStrength = secondCat.getStrength();

        if (firstCat.getAge() > 2 && firstCat.getAge() < 8) {
             firstCatStrength = (float) ((float) firstCat.getStrength() * 1.5);
        }
        if (secondCat.getAge() > 2 && secondCat.getAge() < 8) {
             secondCatStrength = (float) ((float) secondCat.getStrength() * 1.5);
        }

        if (firstCatStrength > secondCatStrength) {
            return 1;
        }
        if (firstCatStrength < secondCatStrength) {
             return -1;
        }
        return 0;
    }
}
