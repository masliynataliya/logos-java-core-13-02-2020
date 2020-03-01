package homework.ihorpayensky.homework04.task2;

// Кермо
class Helm {
    private double diameter;
    private String color;

    public Helm() {
        this.color = "black";
        this.diameter = 25;
    }
    public Helm(double diameter, String color) {
        this.color = color;
        this.diameter = diameter;
    }

    public double getDiameter() { return diameter; }
    public void setDiameter(double diameter) { this.diameter = diameter; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return " === Кермо ===\n" +
                "Diameter:\t" + this.diameter +
                "\nColour: \t" + this.color;
    }
}
