package homework.mikekhay.hmjavacore07.number1;


class Cy27 extends Aiplenet implements Accessibility {
    private double maxkm;
    private String color;
    private KerAirplane kerAirplane = new KerAirplane();

    public Cy27(double dow, double chur, double mas, double maxkm, String color) {
        super(dow,chur,mas);
        this.maxkm = maxkm;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void rryxWerx(){kerAirplane.ryxWerx();}
    public void rryxWper(){kerAirplane.ryxWper();}
    public void rryxNaz(){kerAirplane.ryxNaz();}
    public void rryxWnuz(){kerAirplane.ryxWnuz();}

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
