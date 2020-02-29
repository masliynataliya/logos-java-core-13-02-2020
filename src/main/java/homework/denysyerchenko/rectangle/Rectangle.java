package homework.denysyerchenko.rectangle;

public class Rectangle {
    public double length;
    public double width;

   public Rectangle() {
   }

    public void setLength(double newLength) {length = newLength;}

    public void setWidth(double newWidth) {width = newWidth;}

   public Rectangle(double initLength, double initWidth) {
       length = initLength;
       width = initWidth;
   }
   public void findSquare(double length, double width) {System.out.println("The square of the rectangle = " + (length * width));}
   public void findPerimeter(double length, double width) {System.out.println("The perimeter of the rectangle = " +((length * 2) + (width *2)));}

    @Override
    public String toString(){
        return "Rectangle[Length = " + length + "; Width = " + width + "]";
    }

}
