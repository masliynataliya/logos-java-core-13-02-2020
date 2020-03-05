package homework.ihorpayensky.homeworks.homework07;

class Cy27 extends Plane implements WarPlane {
    private double maxSpeed;
    private String color;
    private PlaneController pb;

    public PlaneController getPb() {
        return pb;
    }

    public Cy27(double weight, double width, double height, double maxSpeed, String color) {
        super(weight, width, height);
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.pb = new PlaneController();
    }

    public double getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }




    @Override
    public void boost() {
        System.out.printf("Boot speed: %s\n", this.maxSpeed + Plane.r.nextInt((int)this.maxSpeed));
    }

    @Override
    public void invisible() {
        System.out.printf("The plain is invisible until %s minutes\n", (Plane.r.nextInt(100 - 20)+20));
    }

    @Override
    public void nuclearBit() {
        System.out.printf("Bombs: %s\n", Plane.r.nextInt(10));
    }
}
