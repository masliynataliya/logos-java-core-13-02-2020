package homework.pavliuk.HW.JC3.Rectangle;

public class Rectangle1 {
    private int length=10;
    private int wigth=10;

    public Rectangle1(int length, int wigth){
        int p=2*(length+wigth);
        int s=length*wigth;
        System.out.println("Rectangle with length " + length);
        System.out.println("Rectangle with wigth "+ wigth) ;
        System.out.println("Perimetr of rectangle = "+p );
        System.out.println("Square of rectangle = "+s +"\t");
    }

    public Rectangle1(){
        System.out.println("\nRectangle with length " + length);
        System.out.println("Rectangle with wigth "+ wigth) ;
        int p=2*(length+wigth);
        System.out.println("Perimetr of rectangle = "+p );
        int s=length*wigth;
        System.out.println("Square of rectangle = "+s);
    }


}
