package homework.romanivanov.javacore.jc04;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Green");
        car1.setType("Mercedes");
        car1.setCab(new Cab(20,20));
        System.out.println(car1.toString());
        Car car2 = new Car(new Helm("Toyota",2),
                new Cab(20,5),
                new Wheel(10,4));
        System.out.println(car2.toString());

    }



}

