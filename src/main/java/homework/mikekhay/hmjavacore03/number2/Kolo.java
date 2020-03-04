package homework.mikekhay.hmjavacore03.number2;

public class Kolo {
    private double rad;
    private double dia;

    public Kolo(double rad) {
        this.rad = rad;
        this.dia = this.rad*2;

    }
    public Kolo(){
        this.rad = 15;
        this.dia = this.rad*2;
    }
    @Override
    public String toString(){
        return " Площа кола = " + (Math.PI*this.dia) + " Периметр колa " + (Math.PI*(this.rad*this.rad));
    }

}
