package homework.denysyerchenko.pets;

public class PetApplication {
    public static void main(String[] args) {
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();

    }
}
