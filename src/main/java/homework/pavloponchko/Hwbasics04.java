package homework.pavloponchko;

import java.util.Scanner;

public class Hwbasics04 {
    public static void main(String[] args) {
        //1 задача
        int[] number = new int[55];
        for (int counter = 0; counter < number.length; counter++) {
            number[counter] = counter;
        }
        for (int i = 0; i < 55; i = ++i) {
            System.out.println(number[i]);
        }
        //2 задача
        int i = 90;
        do {
            System.out.println(i);
            i = i - 5;
        }
        while (i >= 0);

        //задача 3
        double n = 183;
        double s = n % 2;
        if (s == 0) {
            System.out.println("Число є парним");
        } else if (s == 1) {
            System.out.println("Число є Непарним");
        }

        //задача 4
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


        //задача 5
        int [] Array ={8,18,29,84,0,-5,98,103,3,11};
        int max =Array[0];
        int min =Array[0];
        for (int d=0;d<Array.length;d++){
            if(max<Array[d])
                max=Array[d];
            if(min>Array[d])
                min=Array[d];
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
        int array[];
    }
}
