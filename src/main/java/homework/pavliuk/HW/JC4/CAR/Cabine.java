package homework.pavliuk.HW.JC4.CAR;

public class Cabine {
    private String color="white";
    private int size=50;

    public Cabine(){
        this.color=getColor();
        this.size=getSize();
    }
    public Cabine(String color, int size){
        this.color=color;
        this.size=size;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "___Car-Cabine___" +
                "\nCab = " + size +
                "\nColor = " + color;}
}
