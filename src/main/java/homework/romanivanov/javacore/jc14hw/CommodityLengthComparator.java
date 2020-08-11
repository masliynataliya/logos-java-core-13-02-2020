package homework.romanivanov.javacore.jc14hw;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
    public int compare(Commodity com1, Commodity com2) {
        int length1 = com1.getLength();
        int length2 =  com2.getLength();
        return Integer.compare(length1, length2);
    }

}
