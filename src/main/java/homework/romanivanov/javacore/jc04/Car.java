package homework.romanivanov.javacore.jc04;

public class Car  {



    private String color;
    private String type;
    private Cab cab;
    private Helm helm;
    private Wheel wheel;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Helm getHelm() {
        return helm;
    }

    public Cab getCab() {
        return cab;
    }
    public Car(){
        this.helm=new Helm();
        this.cab= new Cab();
        this.wheel = new Wheel();
        this.color = "Green";
        this.type = "Lada";

    }
    public Car(Helm newHelm, Cab newCab, Wheel newWheel){
        this.helm = newHelm;
        this.wheel = newWheel;
        this.cab = newCab;
        this.color = getColor();
        this.type = getType();

    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", cab=" + cab +
                ", helm=" + helm +
                ", wheel=" + wheel +
                '}';
    }
}






