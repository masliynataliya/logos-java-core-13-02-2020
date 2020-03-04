package homework.ihorpayensky.homeworks.homework03;

class TaskMain {
    public static void main(String[] args) {


        // All this classes are private in packages
        // so anyone have access to it.


        // Task 1
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(15, 16);

        r1.getInfo();
        r1.calculateSquare();
        r1.calculatePerimeter();

        r2.getInfo();
        r2.calculateSquare();
        r2.calculatePerimeter();

        // Task 2
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.getInfo();
        c1.calculateSquare();
        c1.calculatePerimeter();

        c2.getInfo();
        c2.calculateSquare();
        c2.calculatePerimeter();

    }
}
