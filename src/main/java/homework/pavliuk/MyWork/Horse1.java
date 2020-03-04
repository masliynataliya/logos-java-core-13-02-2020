package homework.pavliuk.MyWork;

import homework.pavliuk.MyWork.Horse;

public class Horse1 extends Horse {

    private double woingsQuantity;

    public Horse1 (double woingsQuantity, double legsQuantity){
        this.woingsQuantity=woingsQuantity;
        this.legsQuantity=legsQuantity;
    }

    public void fly(){
        System.out.println("I believe, i can fly");
    }
    public String getColor(){
        return this.color;
    }

}
