package homework.didukhigor.homework.javacore7;

import java.util.Random;

public class AirplaneControl{
    Random r = new Random();

    public void motionUp(){
        System.out.println(r.nextInt(10000));
    }

    public void movingDown(){
        System.out.println(r.nextInt(10000));
    }
    public void movingForward(){
        System.out.println(r.nextInt(50000));
    }
    public void movingBackwards(){
        System.out.println(r.nextInt(50000));
    }
    AirplaneControl(int motionUp,int movingDown,int movingForward,int movingBackwards){
        this.motionUp();
        this.movingDown();
        this.movingForward();
        this.movingBackwards();

    }

}
