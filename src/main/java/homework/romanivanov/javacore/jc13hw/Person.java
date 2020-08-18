package homework.romanivanov.javacore.jc13hw;

public abstract class Person {
    private int weight;
    private int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public Person setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Person setHeight(int height) {
        this.height = height;
        return this;
    }
}
