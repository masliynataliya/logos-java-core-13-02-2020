package homework.denysyerchenko.animals;

public class AnimalApplication {
    public static void main(String[] args) {

        Animal fox = new Animal("fox",20, 3);

        System.out.println(" Animal type = " + fox.getType() + ", Animal speed = " + fox.getSpeed() + " km/h" + ", Animal age = " + fox.getAge() + " years");

        fox.setType("bear");
        fox.setSpeed(30);
        fox.setAge(6);

        System.out.println(" Animal type = " + fox.getType() + ", Animal speed = " + fox.getSpeed() + " km/h" + ", Animal age = " + fox.getAge() + " years");
    }
}
