package homework.pavliuk.HW.JC4.CAR;

public class Car {
    private Helm helm;
    private Cabine cabine;

    public Car() {
        this.helm=new Helm();
        this.cabine =new Cabine();
    }
    public Car(Helm helm, Cabine cabine){
        this.helm=helm;
        this.cabine = cabine;
    }

    public void setCabine(Cabine cabine) {
        this.cabine = cabine;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Helm getHelm() {
        return helm;
    }

    public Cabine getCabine() {
        return cabine;
    }
    @Override
    public String toString() {
        return " ========== Автомобіль ==========\n" +
                "Деталі:\n" +
                this.cabine.toString() + "\n" +
                this.helm.toString();
    }
}
