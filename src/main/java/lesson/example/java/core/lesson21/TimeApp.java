package lesson.example.java.core.lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeApp {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getEra());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getYear());
        LocalDateTime localDateTime1 = today.atStartOfDay();
        System.out.println(localDateTime1);

        LocalDate date = LocalDate.of(-1, 1, 1);
        System.out.println(date.getEra());

        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = now.atDate(today);
        System.out.println(localDateTime);
        System.out.println(now.minus(1, ChronoUnit.HOURS));


    }
}
