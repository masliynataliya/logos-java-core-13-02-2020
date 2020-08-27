package homework.mikekhay.hwjavacore16;

public class Car {
    private String producer;
    private int ear;

    public Car() {
    }

    public Car(String producer, int ear) {
        this.producer = producer;
        this.ear = ear;
    }

    public void startTheCar(){
        System.out.println("Авто заведене!!!");
    }

    void muteTheCar(){
        System.out.println("Авто заглушене!!!");
    }

    public String getProducer() {
        return producer;
    }

    public int getEar() {
        return ear;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setEar(int ear) {
        this.ear = ear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", ear=" + ear +
                '}';
    }
}
