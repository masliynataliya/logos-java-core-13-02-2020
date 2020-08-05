package homework.didukhigor.homework.javacore8;

// Створити енум Місяці, в якому створити 12 констант- місяці року(Січень , Лютий.. Грудень ),
//// оголосити змінну дні, та змінну сезон типу Сезон , як поле енума .
// Створити конструктор з визначеними параметрами в енумі Місяці,
//// в який як параметри передати змінну дні та сезон.
// Описати getters до даних полів (дні, сезони).
public enum Months {
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

    private int day;
    private Seasons s;

    private Months(int day, Seasons s) {
        this.day = day;
        this.s = s;
    }

    public int getDay() {
        return day;
    }

    public Seasons getS() {
        return s;
    }

}
