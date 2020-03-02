package homework.romanivanov.javacore.jc04;

public class Helm {

    private int buttons;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getButtons() {
        return buttons;
    }
    public Helm(){
        this.brand = "Lada";
        this.buttons = 0;
    }
    public Helm(String newBrand, int newButtons){
        this.brand = newBrand;
        this.buttons = newButtons;
    }
    @Override
    public String toString() {
        return "Helm{" +
                "buttons=" + buttons +
                ", brand='" + brand + '\'' +
                '}';
    }
}
