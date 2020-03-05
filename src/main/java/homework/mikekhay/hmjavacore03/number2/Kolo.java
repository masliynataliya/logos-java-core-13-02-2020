package homework.mikekhay.hmjavacore03.number2;

public class Kolo {
    private double rad;
    private double dia;

    public Kolo(double rad) {
        this.rad = rad;
        this.dia = this.rad*2;

    }
    public Kolo(){
        this.rad = 4;
        this.dia = this.rad*2;
    }
    public void Dov() {
        System.out.println("Dovguna = " + (Math.PI*this.dia));
    }


    public void Plo() {
        System.out.println("Ploscha = " + (Math.PI*(this.rad*this.rad)));
    }


    @Override
    public String toString() {
        return "Kolo{" +
                "rad=" + rad +
                ", dia=" + dia +
                '}';
    }
}
