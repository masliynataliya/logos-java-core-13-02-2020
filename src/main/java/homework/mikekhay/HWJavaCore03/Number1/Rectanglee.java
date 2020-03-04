package homework.mikekhay.HWJavaCore03.Number1;

public class Rectanglee
{
    private double dov;
    private double chur;

    public Rectanglee(double dov, double chur) {
        this.dov = dov;
        this.chur = chur;
    }

    public Rectanglee() {
        this.dov = 15;
        this.chur = 10;
    }

    @Override
    public String toString() {
        return "Периметр прямокутника = " + ( ( this.dov + this.chur ) * 2 ) + "  Площа прямокутника = " + ( this.dov * this.chur );
    }
}
