package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.Comparator;

class Commodity implements Comparable<Commodity> {
    private String name;
    private int width;
    private int weight;
    private int height;


    public Commodity() { }
    public Commodity(String name, int width, int weight, int height) {
        this.name = name;
        this.width = width;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.name);
    }
}
