package homework.romanivanov.javacore.jc24hw;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private static final int MAX_MINUTE_SIZE = 60;
    private static final int MAX_HOUR_SIZE = 24;
    private final int minutes;
    int moreMinutes;
    private int moreHours;
    private int hours;

    public Time(int minutes, int hours) throws MyHoursException {
        this.minutes = isMinuteMore(minutes);
        int hoursCount = hours + this.hours;
        this.hours = isHour(hoursCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return minutes == time.minutes &&
                hours == time.hours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours);
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return getHours() + " години і " + getMinutes() + " хвилин;";
    }

    int isMinuteMore(int minutes) {
        if (minutes < MAX_MINUTE_SIZE) {
            moreMinutes = minutes;
        } else {
            moreMinutes = minutes - MAX_MINUTE_SIZE;
            hours++;
            isMinuteMore(moreMinutes);
        }
        return moreMinutes;
    }

    int isHour(int hours) throws MyHoursException {
        if (hours < MAX_HOUR_SIZE) {
            moreHours = hours;
        } else {
            throw new MyHoursException();
        }
        return moreHours;
    }


    @Override
    public int compareTo(Time time) {
        if (getHours() > time.getHours()) {
            return 1;
        } else if (getHours() < time.getHours()) {
            return -1;
        } else return Integer.compare(getMinutes(), time.getMinutes());
    }
}
