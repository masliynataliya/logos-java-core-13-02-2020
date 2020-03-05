package lesson.example.java.core.lesson07.lsp.good;

public class GeometryApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(15);

        Square square = new Square();
        square.setWidth(8);

        printArea(rectangle);
        printArea(square);

    }

    public static  void printArea(AreaCountable areaCountable) {
        System.out.println(areaCountable.area());
    }
}
