package homework.mikekhay.HWJavaCore03.Number2;

public class Kolo {
    private double rad;
    private double dia;

    public Kolo(double rad, double dia){
        this.rad = rad;
        this.dia = dia*2;

    }
    public Kolo(){
        this.rad = 15;
        this.dia = rad*2;
    }
    @Override
    public String toString(){
        return " Площа кола = " + (2*Math.PI*this.rad) + " Периметр колa " + (Math.PI*(this.rad*this.rad));
    }

}
