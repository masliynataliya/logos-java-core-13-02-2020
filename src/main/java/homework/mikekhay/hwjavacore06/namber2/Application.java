package homework.mikekhay.hwjavacore06.namber2;

public class Application {
    public static void main(String[] args) {
        MyCalculator myCalculator =new MyCalculator (4,5,8,3,7,4,6,4);

        System.out.println(myCalculator.getDev());
        System.out.println(myCalculator.getMin());
        System.out.println(myCalculator.getMul());
        System.out.println(myCalculator.getPlu());

    }
}
