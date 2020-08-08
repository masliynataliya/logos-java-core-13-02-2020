package homework.mikekhay.hwjavacore11.number2;

public class TaskMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.toString());

        Car car2 = new Car(
                new Kermo( 8 , "Rouse","Durmantin"),
                new Body("Blue" , 37.35 ,"Universal"),
                new Wheel( 20 , "Yellow", 9)
        );
        System.out.println(car2.toString());
    }
}
