package homework.ihorpayensky.homeworks.homework04.task2;

class Task2Main {
    public static void main(String[] args) {

        // поняття не маю які методи ще можна придумати для
        // цих класів які описуються в класі Car.
        // По суті гетерів і сетерів вистачайє з головою.

        Car car1 = new Car();
        System.out.println(car1.toString());

        Car car2 = new Car(
                new Helm(30, "green"),
                new Cab("silver", 50),
                new Wheel(10, "yellow", "gold")
        );
        System.out.println(car2.toString());

    }
}
