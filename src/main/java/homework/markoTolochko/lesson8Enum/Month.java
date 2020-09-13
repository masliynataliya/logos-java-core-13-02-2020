package homework.markoTolochko.lesson8Enum;

import static homework.markoTolochko.lesson8Enum.Seasons.*;

public enum Month {
    JANUARY(31, WINTER),
    FEBRUARY(29, WINTER),
    MARCH(31, SPRING),
    APRIL(30, SPRING),
    MAY(31, SPRING),
    JUNE(30, SUMMER),
    JULY(31, SUMMER),
    AUGUST(31, SUMMER),
    SEPTEMBER(30, AUTUMN),
    OCTOBER(31, AUTUMN),
    NOVEMBER(30, AUTUMN),
    DECEMBER(31, WINTER);

    public String getMonth(String month){
        return month;
    }
    int days;
    Seasons seasons;

    Month(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

}
