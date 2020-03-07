package homework.denysyerchenko.lesson03.fishes;

public class ApplicationFish {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Cleo", "green",3);
        Fish fish2 = new Fish("Nemo",5);
        Fish fish3 = new Fish(2, "gold");
        Fish fish4 = new Fish("Larry");
        Fish fish5 = new Fish(){};
        Fish fish6 = new Fish(4);
        Fish fish7 = new Fish("Tiny","yellow");

        System.out.println(fish1);
        System.out.println(fish2);
        System.out.println(fish3);
        System.out.println(fish4);
        System.out.println(fish5);
        System.out.println(fish6);
        System.out.println(fish7);
    }
}
