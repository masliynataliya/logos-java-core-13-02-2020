package homework.ihorpayensky.homework04.task2;

// Кузов
class Cab {
    private String color;
    private double size;

    public Cab() {
        this.color = "gray";
        this.size = 40;
    }
    public Cab(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    @Override
    public String toString() {
        return " === Кузов ===\n" +
                "Size:\t\t" + this.size +
                "\nColour: \t" + this.color;
    }
}
