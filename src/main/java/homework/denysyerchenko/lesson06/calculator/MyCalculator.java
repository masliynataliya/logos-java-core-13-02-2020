package homework.denysyerchenko.lesson06.calculator;

public class MyCalculator implements Numerable {

    double firstNumber;
    double secondNumber;

    public MyCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
}

    @Override
    public String divide() {
        return ("Result = " + (firstNumber / secondNumber));
    }

    @Override
    public String minus() {
        return ("Result = " + (firstNumber - secondNumber));
    }

    @Override
    public String multiply() {
        return ("Result = " + (firstNumber * secondNumber));
    }

    @Override
    public String plus() {
        return ("Result = " + (firstNumber + secondNumber));
    }
}
