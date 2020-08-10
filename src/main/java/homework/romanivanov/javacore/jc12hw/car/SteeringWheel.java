package homework.romanivanov.javacore.jc12hw.car;

import java.util.ArrayList;

public class SteeringWheel {
    private final int wheelDiameter;
    private final String typeOfMaterial;


    public SteeringWheel() {

        wheelDiameter = HelpTools.rnd(6, 10);
        typeOfMaterial = getTypeOfMaterial();


    }

    private String getTypeOfMaterial() {
        final String typeOfMaterial;
        ArrayList<String> type = new ArrayList<>();
        type.add("lather");
        type.add("alcantara");
        typeOfMaterial = type.get(HelpTools.rnd(0, 1));
        return typeOfMaterial;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "wheelDiameter=" + wheelDiameter +
                ", typeOfMaterial='" + typeOfMaterial + '\'' +
                '}';
    }


}
