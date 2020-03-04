package homework.pavliuk.MyWork;

public class Horse {
    private int age;
    protected double legsQuantity;
   protected String color="Brown";
    private double height;

    public Horse(){}

    public void run(){
        System.out.println("Run, horse, run! ");
    }
    public void speak(){
        System.out.println("Igogo");
    }
    public Horse(double legsQuantity){
        this.legsQuantity=legsQuantity;

    }
}
