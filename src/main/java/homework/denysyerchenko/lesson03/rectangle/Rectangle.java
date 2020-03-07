package homework.denysyerchenko.lesson03.rectangle;

public class Rectangle {
    public double length;
    public double width;

   public Rectangle() {
       length = 22.5;
       width = 11.0;
   }

    public Rectangle(double initLength, double initWidth) {
        length = initLength;
        width = initWidth;
    }

   public void findSquare() {System.out.println("The square of the rectangle = " + (length * width));}
   public void findPerimeter() {System.out.println("The perimeter of the rectangle = " +((length * 2) + (width *2)));}

    @Override
    public String toString(){
        return "Rectangle[Length = " + length + "; Width = " + width + "]";
    }

}
