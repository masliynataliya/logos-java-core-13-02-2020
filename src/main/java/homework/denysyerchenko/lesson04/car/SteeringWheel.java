package homework.denysyerchenko.lesson04.car;

public class SteeringWheel {

    private boolean powerSteering;
    private int steeringSensitivity;

    public boolean getPowerSteering() {
        return powerSteering;
    }

    public int getSteeringSensitivity() {
        return steeringSensitivity;
    }

    public void setPowerSteering(boolean newPowerSteering) {
        powerSteering = newPowerSteering;
    }

    public void setSteeringSensitivity(int newSteeringSensitivity) {
        steeringSensitivity = newSteeringSensitivity;
    }

    public void increaseSteeringSensitivity() {
        System.out.println("Steering sensitivity = " + (steeringSensitivity++));
    }

    public void reduceSteeringSensitivity() {
        System.out.println("Steering sensitivity = " + (steeringSensitivity--));
    }

    public String powerSteeringOn() {
        if (powerSteering == true) {
            return ("power steering is on");
        } else {
            return ("power steering is off");
        }
    }

    public SteeringWheel(boolean initPowerSteering, int initSteeringSensitivity) {
        powerSteering = initPowerSteering;
        steeringSensitivity = initSteeringSensitivity;
    }

    @Override
    public String toString() {
        return "Steering wheel: " + powerSteeringOn() + ", steering sensitivity = " + steeringSensitivity + "";
    }
}

