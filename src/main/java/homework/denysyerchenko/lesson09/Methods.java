package homework.denysyerchenko.lesson09;

public class Methods {

    int a;
    int b;

    public Methods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException();
        } else {
            System.out.println("The sum = " + (a + b));
        }
    }

    public void subtraction() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException();
        } else {
            System.out.println("The difference = " + (a - b));
        }
    }

    public void multiplication() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException();
        } else {
            System.out.println("The product = " + (a * b));
        }
    }

    public void division() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException();
        } else {
            System.out.println("The quotient = " + (a / b));
        }
    }
}

