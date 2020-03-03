package homework.katerynakikidzhan.JC03.additional;

public class DogApplication {
    public static void main(String[] args) {

        Dog clifford = new Dog();

        clifford.setName("Clifford");
        clifford.setSize("big");
        clifford.setBreed("retriever");

        System.out.println(clifford.getName());
        System.out.println(clifford.getSize());
        System.out.println(clifford.getBreed());

    }
}
