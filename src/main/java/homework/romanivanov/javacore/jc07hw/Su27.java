package homework.romanivanov.javacore.jc07hw;

public class Su27 extends Plane implements PlaneCapability {

    private String color;
    private double maxSpeed;
    private PlaneControl planeControl = new PlaneControl();

    public Su27(double length, double wide, double weight, String color, double maxSpeed) {
        super(length, wide, weight);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void moveUP(){
      planeControl.moveUp();

    }
    public void moveDOWN(){
         planeControl.moveDown();
    }
    public void moveLEFT(){
        planeControl.moveLeft();
    }
    public void moveRIGHT(){ planeControl.moveRight();
    }



    @Override
    public void stealthMode() {
        int stealth =(int) ( 2 + Math.random() * 9);
        System.out.println("Літак переходить в режим стелсу на " + stealth + " хвилин");


    }

    @Override
    public void turboMode() {
        double turbo = this.maxSpeed * (5 + Math.random() * 5);
        System.out.println("Літак переходить в режими турбо прискорення зі швидкістю " + turbo);


    }

    @Override
    public void nuclear() {
        int bomb = (int) (1 + Math.random() * 10);
        System.out.println("Літак скидує "+ bomb + " бомб");

    }
}
