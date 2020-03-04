package homework.mikekhay.hmjavacore04.number3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 8.6 , 23.3);
        System.out.println("Name = " + animal.getName() + "     Age = " + animal.getAge() + "    Speeb = " + animal.getSpeed() + " Km/god");
        System.out.println("----------------------------------------");

        animal.setName("Fish");
        animal.setAge(2.8);
        animal.setSpeed(5);
        System.out.println("Name = " + animal.getName() + "     Age = " + animal.getAge() + "    Speeb = " + animal.getSpeed() + " Km/god");
        System.out.println("----------------------------------------");
    }
}