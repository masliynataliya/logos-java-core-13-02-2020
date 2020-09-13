package homework.romanivanov.javacore.jc24hw;

public class Movie {
    private String title;
    private Time duration;

    public Movie(Time duration, String title) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Time getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return " Назва фільму - " + getTitle() + "; " + " Тривалість фільму " + duration;

    }
}
