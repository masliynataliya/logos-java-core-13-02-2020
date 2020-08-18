package homework.romanivanov.javacore.jc14hw.Commodity;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity com1, Commodity com2) {
        int weight1 = com1.getWeight();
        int weight2 =  com2.getWeight();
        return Integer.compare(weight1, weight2);
    }
}
