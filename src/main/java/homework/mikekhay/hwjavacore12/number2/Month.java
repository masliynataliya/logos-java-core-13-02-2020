package homework.mikekhay.hwjavacore12.number2;

import static homework.mikekhay.hwjavacore12.number2.Season.*;


public enum Month {
    JANUARY(31,WINTER),
    FEBRUARY(28,WINTER),
    MARCH(31,SPRING),
    APRIL(30,SPRING),
    MAY(31,SPRING),
    JUNE(30,SUMMER),
    JULY(31,SUMMER),
    AUGUST(30,SUMMER),
    SEPTEMBER(31,AUTUMN),
    OCTOBER(30,AUTUMN),
    NOVEMBER(31,AUTUMN),
    DECEMBER(30,WINTER);


    Season season;
    int day;

    Month(int day, Season season){
        this.day=day;
        this.season=season;
    }

    public Season getSeason() {
        return season;
    }

    public int getDay() {
        return day;
    }


}
