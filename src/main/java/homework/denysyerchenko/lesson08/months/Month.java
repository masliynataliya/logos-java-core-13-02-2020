package homework.denysyerchenko.lesson08.months;

public enum Month {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(29, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.FALL),
    OCTOBER(31, Seasons.FALL),
    NOVEMBER(30, Seasons.FALL),
    DECEMBER(31, Seasons.WINTER);

    int numberOfDays;
    Seasons seasons;

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    Month(int numberOfDays, Seasons seasons) {
        this.numberOfDays = numberOfDays;
        this.seasons = seasons;
    }


}
