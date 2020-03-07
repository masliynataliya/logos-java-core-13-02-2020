package homework.denysyerchenko.lesson03.rectangle;

public class ApplicationRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(16.5, 4.5);
        rectangle1.findPerimeter();
        rectangle1.findSquare();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.findPerimeter();
        rectangle2.findSquare();
    }
}
