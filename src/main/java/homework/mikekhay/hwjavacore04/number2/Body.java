package homework.mikekhay.hwjavacore04.number2;

public class Body {
    //Кузов
    private String color;
    private double number;
    private String tup;

    public Body() {
        this.color = " Blak ";
        this.number = 15;
        this.tup =" Sedan ";
    }
    public Body(String color, double number, String tup){
        this.color = color;
        this.number = number;
        this.tup = tup;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public String getTup() {
        return tup;
    }
    public void setTup(String tup) {
        this.tup = tup;
    }
    @Override
    public String toString() {
        return "    Body Size " + this.number + " Color " + this.color + " Tup " + this.tup;
    }
}
