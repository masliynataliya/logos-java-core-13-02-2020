package homework.romanivanov.javacore.jc14hw.Commodity;

import java.util.Comparator;

public class CommodityNameComparator implements Comparator<Commodity> {
    public int compare(Commodity com1, Commodity com2) {
       String  name1 = com1.getName();
       String name2 =  com2.getName();
        return name1.compareTo(name2);
    }
}
