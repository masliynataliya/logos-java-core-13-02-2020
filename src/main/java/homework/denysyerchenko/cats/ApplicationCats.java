package homework.denysyerchenko.cats;

public class ApplicationCats {
    public static void main(String[] args) {
        Cat cat = new Cat("Smokey", 5, 180);
        Cat anotherCat = new Cat("Lucky", 6, 300);

        cat.attack(anotherCat);
    }
}