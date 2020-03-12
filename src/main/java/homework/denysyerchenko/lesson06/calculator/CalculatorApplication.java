package homework.denysyerchenko.lesson06.calculator;

public class CalculatorApplication {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator(56.78,65.97);
        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.divide());
        System.out.println(calculator.multiply());
    }
}
