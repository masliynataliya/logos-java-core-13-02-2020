package homework.romanivanov.javacore.jc24hw;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws MyHoursException {
        Cinema cinema = new Cinema();
        Scanner sc = new Scanner(System.in);
        while (true) {
            info();
            System.out.println("Введіть потрібну опцію");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Movie movie = getMovie(sc);
                    cinema.addMovie(movie);
                    break;
                case 2:
                    String day = getDayString(sc);
                    Seance seance = getSeance(sc);
                    cinema.addSeance(seance, day);
                    break;
                case 3:
                    cinema.allSeances();
                    break;
                case 4:
                    cinema.removeSeance(getStartTime(sc), getDayString(sc));
                    break;
                case 5:
                    System.out.println("Введіть назву фільма");
                    String name = sc.next();
                    cinema.removeMovie(name);
                    break;
                case 6:
                    cinema.allMovies();
                    break;
                case 7:
                    info();
                    break;
                case 8:
                    System.exit(0);
            }

        }
    }

    private static Time getStartTime(Scanner sc) throws MyHoursException {
        System.out.println("Введіть час початку фільма (години)");
        int hours = sc.nextInt();
        System.out.println("Введіть час початку фільма (хвилини)");
        int minutes = sc.nextInt();
        return new Time(minutes, hours);
    }

    private static String getDayString(Scanner sc) {
        System.out.println("Введіть день сеансу (Monday - Sunday");
        return sc.next();
    }

    private static Movie getMovie(Scanner sc) throws MyHoursException {
        System.out.println("Введіть скільки годин буде йти фільм");
        int hours = sc.nextInt();
        System.out.println("Введіть скільки хвилин буде йти фільм");
        int minutes = sc.nextInt();
        System.out.println("Введіть назву фільма");
        String title = sc.next();
        Time timeDuration = new Time(minutes, hours);
        return new Movie(timeDuration, title);
    }

    private static Seance getSeance(Scanner sc) throws MyHoursException {
        System.out.println("Введіть в скільки годин почнеться фільм");
        int hours = sc.nextInt();
        System.out.println("Введіть скільки хвилин почнеться фільм");
        int minutes = sc.nextInt();
        Time time = new Time(minutes, hours);
        return new Seance(getMovie(sc), time);
    }

    private static void info() {
        System.out.println("Введіть 1 для того щоб добавити фільм в фільмотеку ");
        System.out.println("Введіть 2 для того щоб добавити сеанс ");
        System.out.println("Введіть 3 для того щоб показати всі сеанси");
        System.out.println("Введіть 4 для того щоб видалити сеанс");
        System.out.println("Введіть 5 для того щоб видалити фільм");
        System.out.println("Введіть 6 для того щоб показати всю фільмотеку");
        System.out.println("Введіть 7 для того щоб викликати інфо");
        System.out.println("Введіть 8 для того щоб закінчити програму");
    }
}
