package homework.nazzario.oldhw;
import java.util.Random;
import java.util.Scanner;
public class FullHouseHW {
    public static void main(String[] args) {
       // Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених
        //користувачем. Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
        System.out.println("Введіть перше ціле число:");
        Scanner scan = new Scanner(System.in);
        int m =  scan.nextInt();
        System.out.println ("Введіть друге ціле число:");
        int n =  scan.nextInt();
        int k = m+n;
        System.out.println("Сума ваших чисел=" + k);
    }
}
