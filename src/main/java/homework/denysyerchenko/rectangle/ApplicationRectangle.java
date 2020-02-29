package homework.denysyerchenko.rectangle;

public class ApplicationRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.findPerimeter(15.5, 6.5);
        rectangle1.findSquare(16.5,6.5);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 20.6;
        rectangle2.width = 13.1;
        System.out.println("The perimeter of the rectangle2 = " + ((rectangle2.length * 2) + (rectangle2.width *2)));
        System.out.println("The square of the rectangle2 = " + (rectangle2.length * rectangle2.width));
    }
}
