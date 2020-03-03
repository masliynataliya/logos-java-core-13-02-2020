package lesson.example.java.core.lesson04;

public class Pegasus extends Horse {

    private double wingsQuantity;

    public Pegasus(double wingsQuantity, double legsQuantity) {
        this.legsQuantity = legsQuantity;
        this.wingsQuantity = wingsQuantity;
    }

    public void fly() {
        System.out.println("I believe I can fly!");
    }

    public void run(){
        System.out.println("Pegasus run");
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Pegasus{" +
            "wingsQuantity=" + wingsQuantity +
            ", legsQuantity=" + legsQuantity +
            ", color='" + color + '\'' +
            '}';
    }
}
