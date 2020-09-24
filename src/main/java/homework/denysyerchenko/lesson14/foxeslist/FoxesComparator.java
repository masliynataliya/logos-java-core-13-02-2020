package homework.denysyerchenko.lesson14.foxeslist;

import java.util.Comparator;

public class FoxesComparator implements Comparator<Fox> {
    @Override
    public int compare(Fox f1, Fox f2) {
        if (f1.getAge() > f2.getAge()) {
            return 1;
        } if (f1.getAge() < f2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
