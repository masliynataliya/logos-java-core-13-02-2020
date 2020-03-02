package homework.romanivanov.javacore.jc04;

public class Cab {


    private double wide;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getWide() {
        return wide;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    public Cab() {
        this.wide = 10;
        this.height = 15;
    }
    public Cab(double newWide, double newHeight){
        this.wide = newWide;
        this.height = newHeight;

    }
    @Override
    public String toString() {
        return "Cab{" +
                "wide=" + wide +
                ", height=" + height +
                '}';
    }

}
