package homework.markoTolochko.lesson6InterfaceMultiply;

public class Main {
    public static void main(String[] args) {

        MyCalculator myCalculator = new MyCalculator(20, 5);
        myCalculator.numerableInterface();
        myCalculator.devideInterface();
        myCalculator.minusInterface();
        myCalculator.plusInterface();
        myCalculator.multiplyInterface();
    }
}
