package homework.denysyerchenko.lesson08.numbers.months;

import lesson.example.java.core.lesson07.ocp.good.Family;

import static homework.denysyerchenko.lesson08.numbers.months.Season.*;

public enum Month {
    JANUARY(31, WINTER),
    FEBRUARY(29, WINTER),
    MARCH(31, SPRING),
    APRIL(30, SPRING),
    MAY(31, SPRING),
    JUNE(30, SUMMER),
    JULY(31, SUMMER),
    AUGUST(31, SUMMER),
    SEPTEMBER(30, FALL),
    OCTOBER(31, FALL),
    NOVEMBER(30, FALL),
    DECEMBER(31, WINTER);

    int numberOfDays;
    Season season;

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Season getSeason() {
        return season;
    }

    Month(int numberOfDays, Season season) {
        this.numberOfDays = numberOfDays;
        this.season = season;
    }


}
