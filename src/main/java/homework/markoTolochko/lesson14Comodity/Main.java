package homework.markoTolochko.lesson14Comodity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Commodity> hashSetCommodity = new HashSet<>();

        while (true) {
            System.out.println("add -- 1");
            System.out.println("remove -- 2");
            System.out.println("change --3");
            System.out.println("check all -- 4");
            System.out.println("exit -- 5");
            Scanner scan = new Scanner(System.in);
            int userChoise = scan.nextInt();


            switch (userChoise) {
                case 1: {
                    System.out.println("enter product name: ");
                    String productName = scan.next();
                    System.out.println("enter product lenght");
                    double productLenght = scan.nextDouble();
                    System.out.println("enter product width ");
                    double productWidth = scan.nextDouble();
                    System.out.println("enter product weight ");
                    double productWeight = scan.nextDouble();
                    Commodity commodity = new Commodity(productName, productLenght, productWidth, productWeight);
                    commodity.addProduct();
                    System.out.println(commodity);
                    break;
                }
                case 2: {
                    System.out.println("to delete, enter productName ");
                    String productName = scan.next();
                    Commodity commodity = new Commodity(productName);
                    commodity.removeProduct();
                    System.out.println(commodity);
                    break;
                }
                case 3: {

                }

            }

        }
    }
}
