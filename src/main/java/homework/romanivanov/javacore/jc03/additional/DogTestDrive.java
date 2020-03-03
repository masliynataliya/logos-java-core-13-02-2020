package homework.romanivanov.javacore.jc03.additional;

public class DogTestDrive {

        public static void main(String[] args) {
            Dog dog1 = new Dog();
            dog1.setBreed("Chihuahua");
            dog1.setName("Abrakadabra");
            dog1.setSize(0.57);
            System.out.println("Ім'я собаки - " + dog1.getName());
            System.out.println("Порода собаки - " + dog1.getBreed());
            System.out.println("Розмір собаки - " + dog1.getSize());


        }
    }

