package homework.mikekhay.hwjavacore06.namber1;

public class Workeroclocs implements Zarplata {

    private double oclocs;
    private double money;
    private double sym;

    public Workeroclocs(double oclocs, double money) {
        this.oclocs = oclocs;
        this.money = money;
        this.sym = this.oclocs*this.money;
    }

@Override
    public double getSym() {
        return sym;
    }
}
