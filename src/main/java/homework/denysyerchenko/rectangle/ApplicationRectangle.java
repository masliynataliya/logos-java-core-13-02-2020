package homework.denysyerchenko.rectangle;

public class ApplicationRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(16.5, 4.5);
        rectangle1.findPerimeter();
        rectangle1.findSquare();

        Rectangle rectangle2 = new Rectangle();
        System.out.println("The perimeter of the rectangle2 = " + ((rectangle2.length * 2) + (rectangle2.width *2)));
        System.out.println("The square of the rectangle2 = " + (rectangle2.length * rectangle2.width));
    }
}
