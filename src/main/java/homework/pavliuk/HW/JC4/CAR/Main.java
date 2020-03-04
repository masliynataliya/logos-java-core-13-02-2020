package homework.pavliuk.HW.JC4.CAR;

public class Main {
    public static void main(String[] args) {

        Car car1=new Car();
        System.out.println(car1);
        System.out.println();
        Car car2=new Car(
                new Helm(10,"not leather"),
                new Cabine("black",10));
        System.out.println(car2);

    }
}
