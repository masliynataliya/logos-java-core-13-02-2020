package homework.denysyerchenko.lesson03.dogs;

public class ApplicationDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Sparkey");
        dog1.setSize(5);
        dog1.setAge(12);

        System.out.println("Name = " + dog1.getName());
        System.out.println("Size = " + dog1.getSize());
        System.out.println("Age = " + dog1.getAge());

    }
}
