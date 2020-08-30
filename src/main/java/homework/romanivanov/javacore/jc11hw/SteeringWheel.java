package homework.romanivanov.javacore.jc11hw;

public class SteeringWheel {
    private final int wheelDiameter;
    private final String typeOfMaterial;


    public SteeringWheel() {

        wheelDiameter = HelpTools.rnd(6, 10);
        String[] type = {"lather", "alcantara"};
        typeOfMaterial = type[HelpTools.rnd(0, 1)];


    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "wheelDiameter=" + wheelDiameter +
                ", typeOfMaterial='" + typeOfMaterial + '\'' +
                '}';
    }


}
