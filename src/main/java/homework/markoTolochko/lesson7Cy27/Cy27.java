package homework.markoTolochko.lesson7Cy27;

import java.util.Random;

public class Cy27 extends Plane {

    private int maxSpeed;
    private String color;

    public Cy27(double width, double height, double weight, int maxSpeed, String color) {
        super(width, height, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

     Random random = new Random();

    public void up(){
       int moveRandom = random.nextInt(10000);
       System.out.printf("Cy-27 just made %s meters up\n", moveRandom);
    }
    public void down(){
       int moveRandom = random.nextInt(10000);
       System.out.printf("Cy-27 just made %s meters down\n", moveRandom);

    }
    public void forward(){
        int moveRandom = random.nextInt(10000);
        System.out.printf("Cy-27 just made %s meters forward\n", moveRandom);

    }
    public void back(){
        int moveRandom = random.nextInt(10000);
        System.out.printf("Cy-27 just made %s meters back\n", moveRandom);

    }

    @Override
    public void turboSpeed() {
        int moveRandom = random.nextInt(1500);
        int turvoSpeed = maxSpeed + moveRandom;
        System.out.println(turvoSpeed + "km/h is your turbo speed");
    }

    @Override
    public void stels() {
        int randomStels = random.nextInt();
        System.out.printf("Stels is on...you have just %s min \n ", randomStels);

    }

    @Override
    public void nuclearBomb() {
        int randomBomb = 1 + random.nextInt(10);
        System.out.printf("You have %s bombs ready \n", randomBomb);
    }

    @Override
    public void startEngine() {
        int randomToMove = 20 + random.nextInt(88);
        System.out.println(randomToMove + " seconds to start ");
    }

    @Override
    public void startPlane() {
        double randomDistans = random.nextInt(1000);
        System.out.printf("We have fuel jast for %s km \n", randomDistans);
    }

    @Override
    public void stopPlane() {
        System.out.println("we gonna finish our trip ");

    }
}
