package homework.pavliuk.HW.JC3.Circle;

public class Circle1 {
    private float rad=10f;
    private double dia=10;

    public Circle1 (float rad){
       double length=2*3.14*rad;
        System.out.println("\nRadius of the Circle is " + rad);
        System.out.println("Length of the Circle is " + length + "\t" );
    }
    public Circle1 (double dia){
        double square=3.14*dia/4;
        System.out.println("\nDiametr of the Circle is "+ dia );
        System.out.println("Square of the Circle is "+ square+"\t");
    }
    public Circle1 (){
        double square=3.14*dia/4;
        System.out.println("\nDiametr of the Circle is "+ dia);
        System.out.println("Square of the Circle is "+ square );
        double length=2*3.14*rad;
        System.out.println("Radius of the Circle is " + rad);
        System.out.println("Length of the Circle is " + length + "\t" );

    }
    public Circle1 (double dia,float rad){
        double length=2*3.14*rad;
        System.out.println("\nRadius of the Circle is " + rad);
        System.out.println("Length of the Circle is " + length);
        double square=3.14*dia/4;
        System.out.println("Diametr of the Circle is "+ dia);
        System.out.println("Square of the Circle is "+ square );
    }


}
