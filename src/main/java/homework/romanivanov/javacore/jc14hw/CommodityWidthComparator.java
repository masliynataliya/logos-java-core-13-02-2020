package homework.romanivanov.javacore.jc14hw;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity> {
    public int compare(Commodity com1, Commodity com2) {
        int width1 = com1.getWidth();
        int width2 =  com2.getWidth();
        if (width1 > width2){
            return 1;
        }
         else if (width1 < width2){
            return -1;
        }else return 0;
    }

}
