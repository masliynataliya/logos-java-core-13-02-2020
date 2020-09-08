package homework.romanivanov.javacore.jc24hw;

public class Seance implements Comparable<Seance> {
    private final Time startTime;
    private final Time endTime;
    private Movie movie;

    public Seance(Movie movie, Time startTime) throws MyHoursException {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = setEndTime(movie, startTime);
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return getMovie() + " Старт фільму в  " + startTime + " Кінець фільму у " + endTime;
    }

    Time setEndTime(Movie movie, Time startTime) throws MyHoursException {
        int hoursEndTime = startTime.getHours() + movie.getDuration().getHours();
        int minutesEndTime = startTime.getMinutes() + movie.getDuration().getMinutes();
        return new Time(minutesEndTime, hoursEndTime);
    }

    @Override
    public int compareTo(Seance seance) {
        if (startTime.getHours() > seance.startTime.getHours()) {
            return 1;
        } else if (startTime.getHours() < seance.startTime.getHours()) {
            return -1;
        } else {
            return Integer.compare(startTime.getMinutes(), seance.startTime.getMinutes());
        }
    }
}
