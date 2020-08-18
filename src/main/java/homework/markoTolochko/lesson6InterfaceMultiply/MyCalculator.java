package homework.markoTolochko.lesson6InterfaceMultiply;

public class MyCalculator implements Numerable {
    int a;
    int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyCalculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public void devideInterface() {
        if (b == 0){
            System.out.println("you cant do this...");
            System.exit(0);
        }
        System.out.println("devide: " + (a / b));
    }

    @Override
    public void multiplyInterface() {
        System.out.println("multiply: " + (a * b));
    }

    @Override
    public void plusInterface() {
        System.out.println("plus: " + (a + b));

    }

    @Override
    public void numerableInterface() {
        System.out.println("i am numerable Interface ");
    }

    @Override
    public void minusInterface() {
        System.out.println("minus: " + (a-b));
    }
}
