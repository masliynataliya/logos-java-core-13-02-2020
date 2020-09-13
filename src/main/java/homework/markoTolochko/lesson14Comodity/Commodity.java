package homework.markoTolochko.lesson14Comodity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Commodity implements Comparable<Commodity> {
    private String productName;
    private double productLenght;
    private double productWidth;
    private double productWeight;


    public Commodity() {

    }

    public Commodity(String productName) {
        this.productName = productName;
    }

    public void addProduct() {
        HashSet<Commodity> hashSetCommodity = new HashSet<>();
        hashSetCommodity.add(new Commodity(productName,productLenght,productWidth,productWeight));
    }

    public void removeProduct() {
        HashSet<Commodity> hashSetCommodity = new HashSet<>();
        hashSetCommodity.remove(new Commodity(productName, productLenght, productWidth, productWeight));
    }

    public void changeProduct() {
        HashSet<Commodity> hashSetCommodity = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        ArrayList<Commodity> arrayListCommodity = new ArrayList<>(hashSetCommodity);
        arrayListCommodity.set(scan, new Commodity(productName, productLenght, productWidth, productWeight));
    }

    public Commodity(String productName, double productLenght, double productWidth, double productWeight) {
        this.productName = productName;
        this.productLenght = productLenght;
        this.productWidth = productWidth;
        this.productWeight = productWeight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "productName='" + productName + '\'' +
                ", productLenght=" + productLenght +
                ", productWidth=" + productWidth +
                ", productWeight=" + productWeight+
                '}';
    }


    public String getProductName() {
        return productName;
    }

    public double getProductLenght() {
        return productLenght;
    }

    public double getProductWidth() {
        return productWidth;
    }

    public double getProductWeight() {
        return productWeight;
    }

    @Override
    public int compareTo(Commodity otherCommodity) {
        String productName1 = this.getProductName();
        String productName2 = otherCommodity.getProductName();
        double productLenght1 = this.getProductLenght();
        double productLenght2 = otherCommodity.getProductLenght();
        double productWidth1 = this.getProductWidth();
        double productWidth2 = otherCommodity.getProductWidth();
        double productWeight1 = this.getProductWeight();
        double productWeight2 = otherCommodity.getProductWeight();
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
