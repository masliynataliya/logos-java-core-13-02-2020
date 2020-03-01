package homework.ihorpayensky.homework04.task2;

// Колесо
class Wheel {
    private double diameter;
    private String color;
    private String material;

    public Wheel() {
        this.diameter = 20;
        this.material = "carton";
        this.color = "white";
    }
    public Wheel(double diameter, String color, String material) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
    }

    public double getDiameter() { return diameter; }
    public void setDiameter(double diameter) { this.diameter = diameter; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String toString() {
        return " === Колесо ===\n" +
                "Diameter:\t" + this.diameter +
                "\nColour:\t\t" + this.color +
                "\nMaterial:\t" + this.material;
    }
}
