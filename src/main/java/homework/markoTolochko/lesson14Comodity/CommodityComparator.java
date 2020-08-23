package homework.markoTolochko.lesson14Comodity;

import java.util.Comparator;

public class CommodityComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity commodity1, Commodity commodity2) {
        String productName1 = commodity1.getProductName();
        String productName2 = commodity2.getProductName();
        double productLenght1 = commodity1.getProductLenght();
        double productLenght2 = commodity2.getProductLenght();
        double productWidth1 = commodity1.getProductWidth();
        double productWidth2 = commodity2.getProductWidth();
        double productWeight1 = commodity1.getProductWeight();
        double productWeight2 = commodity2.getProductWeight();
        if (productName1.compareTo(productName2) != 0) {
            return productName1.compareTo(productName2);
        } else {
            if (productLenght1 > productLenght2) {
                return 1;
            } else if (productLenght1 < productLenght2) {
                return -1;
            } else {
                if (productWidth1 > productWidth2) {
                    return 1;
                } else if (productWidth1 < productWidth2) {
                    return -1;
                } else {
                    if (productLenght1 > productLenght2) {
                        return 1;
                    } else if (productLenght1 < productLenght2) {
                        return -1;
                    } else {
                        if (productWeight1 > productWeight2) {
                            return 1;
                        } else if (productWeight1 < productWeight2) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }
}