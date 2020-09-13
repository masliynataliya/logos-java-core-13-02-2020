package homework.markoTolochko.lesson7Cy27;

public abstract class Plane implements PlaneOptions {

    private double width;
    private double height;
    private double weight;

    public Plane(double width, double height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public abstract void startEngine();
    public abstract void startPlane();
    public abstract void stopPlane();



}
