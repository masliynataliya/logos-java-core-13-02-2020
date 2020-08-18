package homework.markoTolochko.lesson8Enum;

public class Main {
    public static void main(String[] args) {

        Month month = Month.valueOf("MARCH".toUpperCase());
        System.out.println(month);
        System.out.println();

        Month[] months = Month.values();
        String monthCheked = "MARCH";
        Month month1 = Month.valueOf(monthCheked);
        Seasons s = month.getSeasons();
        for (int i = 0; i < months.length; i++) {
            if (s.equals(months[i].getSeasons())) {
                System.out.println(months[i]);
            }
        }
    }
}