package homework.denysyerchenko.lesson13.parliament;

public class Man {
    private int height;
    private  int weight;

    public Man() {
    }

    public Man(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Man{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
