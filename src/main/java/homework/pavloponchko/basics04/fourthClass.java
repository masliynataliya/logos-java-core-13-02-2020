package homework.pavloponchko.basics04;

import java.util.Scanner;

public class fourthClass {
    public static void main(String[] args) {
        System.out.println("Enter number a\b");
        Scanner mat=new Scanner(System.in);
        double a=mat.nextDouble();
        System.out.println("Enter number b\b");
        double b=mat.nextDouble();
        final double c= 10;

        double z1 = a <= c ? c - a : a - c;
        double z2 = b <= c ? c - b : b - c;
        if(z1 < z2) {
            System.out.println("closer to" + a);
        } else {
            System.out.println("closer to" + b);
        }
    }
}
