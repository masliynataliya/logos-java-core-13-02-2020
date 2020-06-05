package homework.ihorpayensky.homeworks.homework09.task2;

class Methods {

    public static void doAll(double a, double b) throws MyException {
        if (a < 0 && b < 0)
            throw new IllegalArgumentException();
        else if (a==0 && b!=0 || a!=0 && b==0)
            throw new ArithmeticException();
        else if (a>0 && b>0)
            throw new MyException("\na + b = " + addition(a,b)
                    + "\na - b = " + subtraction(a,b)
                    + "\na * b = " + multiplication(a,b)
                    + "\na / b = " + division(a,b) + "\n\n");
    }

    public static double addition(double a, double b) {
        return a+b;
    }

    public static double subtraction(double a, double b) {
        return a-b;
    }

    public static double multiplication(double a, double b) {
        return a*b;
    }

    public static double division(double a, double b) {
        return a/b;
    }
}
