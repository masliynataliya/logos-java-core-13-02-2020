package homework.romanivanov.basics;

public class Homework4 {
        public static void main(String[] args) {


            //1.Завдання
            int i = 1;
            int t = 0;
            while (i <= 110) {
                System.out.println(i);
                i = i + 2;
                t = t + i;
                //сума всіх елементів
            }
            System.out.println("Сума всіх елементів = " + t);

            //2 Завдання
            int b = 90;
            do {
                System.out.println(b);
                b = b - 5;
            }
            while (b >= 0);


            //3 завдання
            double n = 1321;
            double s = n % 2;
            if (s == 1) {
                System.out.println("Число є непарним");


            } else if (s == 0) {
                System.out.println("Число є парним");

            }
            //4
            int minus = 8;
            int f = 13;

            if (Math.abs(minus - 10) > Math.abs(f - 10)) {

                System.out.println(f);

            } else {
                System.out.println(minus);
            }


            int min = 0;
            int max = 0;
            int[] array = {-123, -128, -3323, -56, -57, -2, -43, -42, -44};
            for (b = 0; b < array.length; b++) {
                if (b == 0) {
                    max = array[b];
                    min = array[b];
                }

                if (min > array[b])
                    min = array[b];
                if (max < array[b])
                    max = array[b];




            }
            System.out.println("Мінімальне число масиву - " + min);
            System.out.println("Максимальне число масиву - " + max);

        }
    }
    
