package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.Comparator;

class WeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWeight() == o2.getWeight())
            return 0;
        if (o1.getWeight() < o2.getWeight())
            return 1;
        return -1;
    }
}
