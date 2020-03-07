package homework.nazzario.oldhw;

import java.util.Scanner;

public class number10 {



    public static class Main {

        public static void main(String[] args) {
            // write your code here
            //Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і
            //11,45 найближче до десяти 11,45.
            System.out.print("Введіть будь-яке чило m: ");
            Scanner scan = new Scanner(System.in);
            double m = scan.nextDouble();
            System.out.println ("Введіть будь-яке число n ");
            double n = scan.nextDouble();
            if(Math.abs(m-10)<Math.abs(n-10)){
                System.out.println("Найближче число до 10 "+ m);
            }
            else System.out.println("Найближче число до 10 "+ n);
        }
    }

}
