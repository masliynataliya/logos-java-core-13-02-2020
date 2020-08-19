package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.Comparator;

class WidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWidth() == o2.getWidth())
            return 0;
        if (o1.getWidth() < o2.getWidth())
            return 1;
        return -1;
    }
}
