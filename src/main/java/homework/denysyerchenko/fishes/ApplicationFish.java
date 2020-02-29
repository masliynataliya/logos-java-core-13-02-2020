package homework.denysyerchenko.fishes;

public class ApplicationFish {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Cleo", "green",3);
        Fish fish2 = new Fish("Nemo",5);
        Fish fish3 = new Fish(4, "gold");
        Fish fish4 = new Fish("Larry");
        Fish fish5 = new Fish(){};

        System.out.println(fish1);
        System.out.println(fish2);
        System.out.println(fish3);
        System.out.println(fish4);
        System.out.println(fish5);
    }
}
