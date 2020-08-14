package lesson.example.java.core.lesson17;

public class PersonApp {

    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();

        Personable sporstman = personFactory.createSportsman();
        sporstman.eat();
        sporstman.move();
        sporstman.sleep();

        System.out.println();

        Personable gardener = personFactory.createGardener();
        gardener.eat();
        gardener.move();
        gardener.sleep();

        System.out.println();

        Personable anonim = personFactory.createAnonim();
        anonim.eat();
        anonim.move();
        anonim.sleep();

        System.out.println();

        Personable golfPlayer = personFactory.createGolfPlayer();
        golfPlayer.eat();
        golfPlayer.move();
        golfPlayer.sleep();
    }
}
