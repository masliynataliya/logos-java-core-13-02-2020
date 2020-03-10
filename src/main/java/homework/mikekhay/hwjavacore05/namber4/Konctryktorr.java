package homework.mikekhay.hwjavacore05.namber4;

public class Konctryktorr {
   double a;
   double b;
   String kolor;

    public Konctryktorr(){
        this(1,5);
    }

    public Konctryktorr(double a, double b){
       this.a = a;
       this.b = b;
   }
   public Konctryktorr(double a, double b, String kolor){
        this(a, b);
        this.kolor=kolor;
   }

}
