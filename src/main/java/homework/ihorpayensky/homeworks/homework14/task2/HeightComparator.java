package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.Comparator;

class HeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getHeight() == o2.getHeight())
            return 0;
        if (o1.getHeight() > o2.getHeight())
            return 1;
        return -1;
    }
}
