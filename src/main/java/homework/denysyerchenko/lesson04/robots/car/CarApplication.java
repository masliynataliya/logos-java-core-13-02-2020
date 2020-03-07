package homework.denysyerchenko.lesson04.robots.car;

public class CarApplication {
    public static void main(String[] args) {
        SteeringWheel steeringWheel1 = new SteeringWheel(true, 10);
        CarBody carBody1 = new CarBody("coupe", 187, 72, 51);
        Tire tire1 = new Tire(26.1);
        Car mustang = new Car("Ford Mustang Boss", 1969, steeringWheel1, carBody1, tire1);

        System.out.println(mustang);

    }
}
