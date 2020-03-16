package homework.denysyerchenko.lesson09;

public class Main {
    public static void main(String[] args) throws MyException, IllegalAccessException {
        Methods calculator = new Methods(5,7);
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
    }
}
