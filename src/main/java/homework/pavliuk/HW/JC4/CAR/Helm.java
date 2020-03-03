package homework.pavliuk.HW.JC4.CAR;

public class Helm {
    private int rad=10;
    private String material="leather";
    public Helm(){
        this.rad=getRad();
        this.material=getMaterial();
    }
    public Helm(int rad,String material){
        this.rad=rad;
        this.material=material;
    }


    public void setRad(int rad){
        this.rad=rad;
    }
    public int getRad(){
        return rad;
    }
    public String setMaterial(String material){
        this.material=material;
        return material;}
    public String getMaterial(){
        return material;
    }
    @Override
    public String toString() {
        return "___Car-Helm___" +
                "\nhelm rad = " + rad +
                "\nmaterial of helm is " + material;}
}
