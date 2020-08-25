package homework.mikekhay.hwjavacore13.number1;

public class People {
    private int weight;
    private int growth;

    public People(int weight, int growth) {
        this.weight = weight;
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public int getGrowth() {
        return growth;
    }

    public People setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public People setGrowth(int growth) {
        this.growth = growth;
        return this;
    }

    @Override
    public String toString() {
        return "People{" +
                "weight=" + weight +
                ", growth=" + growth +
                '}';
    }
}
