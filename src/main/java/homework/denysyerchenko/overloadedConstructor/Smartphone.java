package homework.denysyerchenko.overloadedConstructor;

public class Smartphone {

    String chipset;
    int ram;
    int battery;
    float screenSize;

    public Smartphone(String chipset, int ram, int battery) {
        this.chipset = chipset;
        this.ram = ram;
        this.battery = battery;
    }

    public Smartphone(String chipset, int ram, int battery, float screenSize) {
        this(chipset, ram, battery);
        this.screenSize = screenSize;
    }
}
