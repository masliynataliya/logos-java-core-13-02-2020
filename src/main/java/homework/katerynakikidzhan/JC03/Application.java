package homework.katerynakikidzhan.JC03;

public class Application {
    public static void main(String[] args) {
        Circle circle1 =  new Circle();

        System.out.printf("The area of this circle is %s.%n", circle1.area());
        System.out.printf("The length of this circle is %s.%n", circle1.length());

        Rectangle rectangle1 = new Rectangle(34, 5);

        rectangle1.area();
        rectangle1.perimeter();

        System.out.printf("The area of this rectangle is%s.%n", rectangle1.area());

        System.out.printf("The perimeter of this rectangle is %s.%n", rectangle1.perimeter());
    }
}
