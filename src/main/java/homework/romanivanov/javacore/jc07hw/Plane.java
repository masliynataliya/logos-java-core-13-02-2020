package homework.romanivanov.javacore.jc07hw;

public abstract class Plane implements PlaneCapability  {

    private double length;
    private double wide;
    private double weight;
    private boolean engineX;


    public void startEngine() {
        if (engineX == false){
        int engine =(int) (1 + Math.random() * 4 );
        System.out.println("Літак взлетів за " + engine + " Секунд");
        engineX = true;}
        else;


    }

    public void takeoff(){
        double takeoff = (Math.random() * 1000);
        System.out.println("Літак зможе пролетіти " + takeoff + " мегаметра при повному баці");

    }

    public void landing(){
        System.out.println("Літак йде на посадку");
        engineX = false;




    }


    public Plane(double length, double wide, double weight) {
        this.length = length;
        this.wide = wide;
        this.weight = weight;
    }

}
