package lesson.example.java.core.lesson04;

public class Horse {

    private int age;
    protected double legsQuantity;
    protected String color = "white";
    private double height;

    public void run() {
        System.out.println("Run, horse, run!");
    }

    public void speak() {
        System.out.println("Igogo))");
    }

    public Horse() {

    }

    public Horse(double legsQuantity){
        this.legsQuantity = legsQuantity;
    }

    @Override
    public String toString() {
        return "Horse{" +
            "age=" + age +
            ", legsQuantity=" + legsQuantity +
            ", color='" + color + '\'' +
            ", height=" + height +
            '}';
    }
}
