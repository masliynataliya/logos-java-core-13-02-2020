package homework.mikekhay.hwjavacore06.namber2;

public class MyCalculator implements Numerable {
    private double dev1;
    private double dev2;
    private double min1;
    private double min2;
    private double myl1;
    private double myl2;
    private double plu1;
    private double plu2;


     public MyCalculator (double dev1, double dev2, double min1, double min2, double myl1, double myl2, double plu1, double plu2) {
         this.dev1=dev1;
         this.dev2=dev2;
         this.min1=min1;
         this.min2=min2;
         this.myl1=myl1;
         this.myl2=myl2;
         this.plu1=plu1;
         this.plu2=plu2;
     }

    @Override
    public double getDev() {
        return (this.dev1/this.dev2);
    }
    @Override
    public double getMin() {
        return (this.min1-this.min2);
    }
    @Override
    public double getMul() {
        return (this.myl1*this.myl2);
    }
    @Override
    public double getPlu() {
         return (this.plu1+this.plu2);
     }
}
