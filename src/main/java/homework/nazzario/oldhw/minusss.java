package homework.nazzario.oldhw;

public class minusss {
    public static class Main {

        public static void main(String[] args) {
            // write your code here
            // 2. Створіть програму, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ....
            int a = 90;
            int b = 5;

            while (a >= 0) {
                System.out.print(a + " ");
                a = a - b;
            }

        }
    }
}
