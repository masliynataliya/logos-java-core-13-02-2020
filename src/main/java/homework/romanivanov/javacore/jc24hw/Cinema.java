package homework.romanivanov.javacore.jc24hw;

import java.util.ArrayList;
import java.util.TreeMap;

public class Cinema {
    private static Time OPEN;
    private static Time CLOSE;

    static {
        try {
            OPEN = new Time(0, 7);
        } catch (MyHoursException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            CLOSE = new Time(0, 23);
        } catch (MyHoursException e) {
            e.printStackTrace();
        }
    }

    private final TreeMap<Days, Schedule> schedules = new TreeMap<>();
    private final ArrayList<Movie> movies = new ArrayList<>();

    public Cinema() {
        init();
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "schedules=" + schedules +
                ", movies=" + movies +
                '}';
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(movies);

    }

    public void addSeance(Seance seance, String day) {
        Days da1 = Days.valueOf(day.toUpperCase());
        schedules.get(da1).addSeances(seance);
        System.out.println(schedules);
        isCinemaOpen(da1);
        System.out.println(schedules);

    }

    public void removeMovie(String movieName) {
        movies.removeIf(movie -> movie.getTitle().equalsIgnoreCase(movieName));
        schedules.keySet()
                .forEach(days -> schedules.get(days)
                        .seances.removeIf(seance -> seance.getMovie().getTitle().equalsIgnoreCase(movieName)));
        System.out.println(movies);
        System.out.println(schedules);
    }

    public void removeSeance(Time startTime, String day) {
        Days day1 = Days.valueOf(day.toUpperCase());
        schedules.get(day1).removeSeances(startTime);
        System.out.println(schedules);
    }


    public void allSeances() {
        schedules.forEach((days, schedule) -> System.out.println(schedules.get(days)));
    }

    public void init() {
        schedules.put(Days.MONDAY, new Schedule());
        schedules.put(Days.TUESDAY, new Schedule());
        schedules.put(Days.WEDNESDAY, new Schedule());
        schedules.put(Days.THURSDAY, new Schedule());
        schedules.put(Days.FRIDAY, new Schedule());
        schedules.put(Days.SATURDAY, new Schedule());
        schedules.put(Days.SUNDAY, new Schedule());
    }

    public void allMovies() {
        movies.forEach(System.out::println);
    }


    private void isCinemaOpen(Days day) {
        schedules.get(day).seances.removeIf(seance -> seance.getStartTime().getHours() < OPEN.getHours()
                || seance.getEndTime().getHours() >= CLOSE.getHours());

    }


}
