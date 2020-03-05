package lesson.example.java.core.lesson07.lsp.bad;

public class GeometryApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setHeight(10);
        rectangle.setWidth(15);

        System.out.println(rectangle.area());
    }
}
