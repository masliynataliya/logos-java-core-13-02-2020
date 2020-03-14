package homework.didukhigor.homework.javacore4.car;

public class Body {

    private double numberOfSeats;
    private String bodyType;

    public Body(double numberOfSeats, String bodyType){
        this.numberOfSeats = numberOfSeats;
        this.bodyType = bodyType;
    }
    public Body(){
        this.numberOfSeats = 4;
        this.bodyType = "Metal";
    }
    public double getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOfSeats(double numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }
    public String getBodyType(){
        return bodyType;
    }
    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }
    @Override
    public String toString() {
        return "Body{" +
                "numberOfSeats=" + numberOfSeats +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
    public void changeNumberOfSeats(){numberOfSeats *=2;}
    public void changeBodyType(){bodyType = "Wood";}


}
