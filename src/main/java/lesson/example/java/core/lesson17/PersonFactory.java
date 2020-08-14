package lesson.example.java.core.lesson17;

public class PersonFactory {

    // внутрішній клас
    private class Sportsman implements Personable {

        @Override
        public void eat() {
            System.out.println("Sportsman eats");
        }

        @Override
        public void sleep() {
            System.out.println("Sportsman sleeps");
        }

        @Override
        public void move() {
            System.out.println("Sportsman runs");
        }
    }

    // метод зовнішнього класу PersonFactory
    public Sportsman createSportsman() {
        return new Sportsman();
    }

    // метод зовнішнього класу PersonFactory
    public Personable createGardener() {

        // локальниий клас
        class Gardener implements Personable {

            @Override
            public void eat() {
                System.out.println("Gardener eats");
            }

            @Override
            public void sleep() {
                System.out.println("Gardener sleeps");
            }

            @Override
            public void move() {
                System.out.println("Gardener works");
            }
        }

        return new Gardener();
    }

    // метод зовнішнього класу PersonFactory
    public Personable createAnonim() {

        // повертаємо об'єкт анонімного класу
        return new Personable() {
            @Override
            public void eat() {
                System.out.println("Anonim eats");
            }

            @Override
            public void sleep() {
                System.out.println("Anonim sleeps");
            }

            @Override
            public void move() {
                System.out.println("Anonim hides");
            }
        }; // обов'язкова крапка з комою
    }

    // внутрішній статичний клас
    static class GolfPlayer implements Personable {
        @Override
        public void eat() {
            System.out.println("GolfPlayer eats");
        }

        @Override
        public void sleep() {
            System.out.println("GolfPlayer sleeps");
        }

        @Override
        public void move() {
            System.out.println("GolfPlayer plays golf");
        }
    }

    // метод зовнішнього класу PersonFactory
    public GolfPlayer createGolfPlayer() {
        return new GolfPlayer();
    }
}
