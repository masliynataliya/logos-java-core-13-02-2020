package homework.romanivanov.javacore.jc14hw.Commodity;

public class Commodity {
    private String name;
    private int length;
    private int width;
    private int weight;

    public Commodity() {
    }

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public Commodity setName(String name) {
        this.name = name;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Commodity setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Commodity setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Commodity setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
