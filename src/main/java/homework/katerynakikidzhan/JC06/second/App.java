package homework.katerynakikidzhan.JC06.second;

public class App {
    public static void main(String[] args) {

        MyCalculator num = new MyCalculator();

        System.out.println("The sum: " + num.getSum());
        System.out.println("The difference: " + num.getDifference());
        System.out.println("The product: "+ num.getProduct());
        System.out.println("The quotient: "+ num.getQuotient());
    }
}
