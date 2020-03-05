package homework.mikekhay.hmjavacore03.number1;

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


    public void plo() {
        System.out.println(" Ploscha = " + (dov * chur));
    }

    public void per() {
        System.out.println(" Perumetr = " + (2 * (dov + chur)));
    }

    @Override
    public String toString() {
        return "Rectanglee{" +
                "dov=" + dov +
                ", chur=" + chur +
                '}';
    }
}
