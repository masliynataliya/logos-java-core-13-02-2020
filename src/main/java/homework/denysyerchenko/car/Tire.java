package homework.denysyerchenko.car;

public class Tire {

    private double diskDiameter;

    public double getDiskDiameter() {
        return diskDiameter;
    }

    public void setDiskDiameter(double newDiskDiameter) {
        diskDiameter = newDiskDiameter;
    }

    public void increaseDiskDiameter() {
        System.out.println("Disk diameter = " + (diskDiameter++));
    }

    public void reduceDiskDiameter() {
        System.out.println("Disk diameter = " + (diskDiameter--));
    }

    public Tire(double initDiskDiameter) {
        diskDiameter = initDiskDiameter;
    }

    @Override
    public String toString() {
        return "disk diameter = " + diskDiameter + " inches ";
    }
}
