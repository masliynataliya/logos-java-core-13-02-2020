package homework.katerynakikidzhan.JC03.additional;

public class FishApplication {
    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo", "red and white", "small", "clownfish");

        Fish dory = new Fish("Dory", "blue and yellow", "small");

        Fish shark = new Fish("Sharky", "gray");

        Fish bream = new Fish("Flounder");

        Fish fish = new Fish();

        System.out.println(nemo);
        System.out.println(dory);
        System.out.println(shark);
        System.out.println(bream);
        System.out.println(fish);
    }
}
