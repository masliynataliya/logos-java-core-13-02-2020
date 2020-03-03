package homework.katerynakikidzhan.JC03.additional;

public class CatApplication {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.toString());

        Cat anotherCat = new Cat("Black", 1, 15);
        System.out.println(anotherCat.toString());

        System.out.println(cat1.attack(anotherCat));
    }
}
