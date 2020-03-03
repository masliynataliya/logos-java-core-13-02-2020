package homework.denysyerchenko.animals;

public class Animal {

    private String type;
    private int speed;
    private int age;

     public Animal(String initType, int initSpeed, int initAge) {
         type = initType;
         speed = initSpeed;
         age = initAge;
     }

    public String getType() {return type;}
    public int getSpeed() {return speed;}
    public int getAge() {return age;}

    public void setType(String newType) {type = newType;}
    public void setSpeed(int newSpeed) {speed = newSpeed;}
    public void setAge(int newAge) {age = newAge;}
}
