package homework.mikekhay.hwjavacore09.number02;

public class Methods {

        public void allException(double a, double b) throws MyException, IllegalAccessException,ArithmeticException {
            System.out.println("Додавання  = " + (a + b));
            System.out.println("Віднімання = " + (a - b));
            System.out.println("Множення   = " + a * b);
            System.out.println("Ділення    = " + a / b);
            if (a < 0.0D && b < 0.0D) {
                throw new IllegalArgumentException();
            } else if (a == 0.0D && b != 0.0D) {
                throw new ArithmeticException();
            } else if (a != 0.0D && b == 0.0D) {
                throw new ArithmeticException();
            } else if (a == 0.0D && b == 0.0D) {
                throw new IllegalAccessException();
            } else if (a > 0.0D && b > 0.0D) {
                throw new MyException();
            } else {
                System.out.println("Кінець програми.");
            }
        }
    }
