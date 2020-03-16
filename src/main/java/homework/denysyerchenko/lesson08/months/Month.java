package homework.denysyerchenko.lesson08.months;

public enum Month {
    JANUARY(31, Season.WINTER),
    FEBRUARY(29, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.FALL),
    OCTOBER(31, Season.FALL),
    NOVEMBER(30, Season.FALL),
    DECEMBER(31, Season.WINTER);

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
