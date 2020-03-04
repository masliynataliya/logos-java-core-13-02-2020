package homework.mikekhay.hmjavacore04.number2;

public class Car {
    private Kermo kermo;
    private Body body;
    private Wheel wheel;


    public Car(){
        this.kermo = new Kermo();
        this.body = new Body();
        this.wheel = new Wheel();
    }
    public Car(Kermo kermo, Body body, Wheel wheel) {
        this.kermo = kermo;
        this.body = body;
        this.wheel = wheel;
    }
    public Kermo getKermo() {
        return kermo;
    }
    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }
    public Body getBody(){
        return body;
    }
    public void setBody(Body body){
        this.body = body;
    }
    public Wheel getWheel(){
        return wheel;
    }
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public  String toString(){
        return " Car " +
                this.kermo.toString() +
                this.wheel.toString() +
                this.body.toString();
    }
}
