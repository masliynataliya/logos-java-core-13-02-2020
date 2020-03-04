package homework.ihorpayensky.homeworks.homework04.task2;

class Car {
    private Helm helm;
    private Cab cab;
    private Wheel wheel;

    public Car() {
        this.helm = new Helm();
        this.cab = new Cab();
        this.wheel = new Wheel();
    }
    public Car(Helm helm, Cab cab, Wheel wheel) {
        this.helm = helm;
        this.cab = cab;
        this.wheel = wheel;
    }

    public Helm getHelm() {return helm; }
    public void setHelm(Helm helm) { this.helm = helm; }
    public Cab getCab() { return cab; }
    public void setCab(Cab cab) { this.cab = cab; }
    public Wheel getWheel() { return wheel; }
    public void setWheel(Wheel wheel) { this.wheel = wheel; }

    @Override
    public String toString() {
        return " ========== Автомобіль ==========\n" +
                "Деталі:\n" +
                this.cab.toString() + "\n" +
                this.wheel.toString() + "\n" +
                this.helm.toString();
    }
}
