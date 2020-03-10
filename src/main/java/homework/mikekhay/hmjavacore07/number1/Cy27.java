package homework.mikekhay.hmjavacore07.number1;


class Cy27 extends Aiplenet implements Accessibility {

    private double maxkm;
    private double dow;
    private double chur;
    private double mas;
    private String color;

    public Cy27(double dow, double chur, double mas, double maxkm, String color) {
        this.dow = dow;
        this.chur = chur;
        this.mas = mas;
        this.maxkm = maxkm;
        this.color = color;
    }

    @Override
    public void boost() {
        System.out.println("Boot speed= " + (maxkm + random.nextInt(500))+"km/hour.");
    }
    @Override
    public void tehnoligistels() {
        System.out.println("Stels Tehnoligi on = " + random.nextInt(500)+"c.");
    }

    @Override
    public void nuclearstrike() {
        System.out.println("Nuclear strike = " + random.nextInt(10) + " nuclear warheads.");
    }
}
