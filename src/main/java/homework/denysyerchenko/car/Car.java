package homework.denysyerchenko.car;

public class Car {

    private SteeringWheel steeringWheel;
    private CarBody carBody;
    private Tire tire;
    private int year;
    private String name;

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public Tire getTire() {
        return tire;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setSteeringWheel(SteeringWheel newSteeringWheel) {
        steeringWheel = newSteeringWheel;
    }

    public void setCarBody(CarBody newCarBody) {
        carBody = newCarBody;
    }

    public void setTire(Tire newTire) {
        tire = newTire;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void startCar() {
        System.out.println("The car is started");
    }

    public Car(String initName, int initYear, SteeringWheel initSteeringWheel, CarBody initCarBody, Tire initTire) {
        steeringWheel = initSteeringWheel;
        carBody = initCarBody;
        tire = initTire;
        year = initYear;
        name = initName;
    }

    @Override
    public String toString() {
        return "Car name = " + name + "; Year = " + year + "; " + steeringWheel + "; Car body type = " + carBody + "; Tire : " + tire + "";

    }
}
