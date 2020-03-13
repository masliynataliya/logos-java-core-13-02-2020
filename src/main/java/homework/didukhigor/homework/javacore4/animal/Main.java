package homework.didukhigor.homework.javacore4.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat",2,14);
         System.out.println("Name of animal=  "+ animal.getName()+"  age of animal= "+ animal.getAge()+"   speed of animal= "+ animal.getSpeed()+"---" +
                 "------------------------------------------------");

         animal.setName("Fat cat");
         animal.setAge(12);
         animal.setSpeed(2);
        System.out.println("Name of animal= "+ animal.getName()+"  age of animal= "+ animal.getAge()+"   speed of animal= "+ animal.getSpeed());

    }
}
