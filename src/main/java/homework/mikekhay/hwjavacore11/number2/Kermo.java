package homework.mikekhay.hwjavacore11.number2;

public class Kermo {

    private double diameter;
    private String material;

    public Kermo() {
        diameter = 6 + (int) ( Math.random() * 4 );
        double number = Math.random();
        if(number<0.5){ material="Leather"; }
        else {material="Alcantara"; }
    }
    @Override
    public String toString() {
        return "Kermo{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
