package homework.romanivanov.javacore.jc06hw.task2;

public class Calculator implements Numerable {

    @Override
    public void divide(double a, double b) {
        double d = a/b;
        System.out.println(d);
    }

    @Override
    public void minus(double a, double b) {
        double m = a - b ;
        System.out.println(m);

    }

    @Override
    public void multiply(double a, double b) {
        double ml = a * b ;
        System.out.println(ml);

    }

    @Override
    public void sum(double a, double b) {
        double s = a + b;
        System.out.println(s);

    }
}
