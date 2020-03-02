package homework.romanivanov.javacore.jc04;

public class Wheel {



    private double radius;
    private double maxIndex;
    //індекс нагрузки


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(double maxIndex) {
        this.maxIndex = maxIndex;
    }
    public Wheel(){
        setMaxIndex(20);
        getRadius();
    }
    public Wheel(double newRadius, double newMaxIndex){
        this.radius = newRadius + this.radius;
        this.maxIndex = newMaxIndex;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", maxIndex=" + maxIndex +
                '}';
    }

}
