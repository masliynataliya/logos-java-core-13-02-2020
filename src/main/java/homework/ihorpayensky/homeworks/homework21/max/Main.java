package homework.ihorpayensky.homeworks.homework21.max;

import java.time.*;
import java.util.Date;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {

        Function<Date, LocalDate> dataToLocalDate =
                x -> Instant.ofEpochMilli(x.getTime())
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();

        Function<Date, LocalTime> dateLocalTime =
                x -> LocalDateTime
                        .ofInstant(x.toInstant(), ZoneId.systemDefault())
                        .toLocalTime();

        Function<Date, LocalDateTime> dateLocalDateTime =
                x -> x.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime();

        Date date = new Date();
        System.out.println("Date: " + date);
        System.out.println("Date to LocalData: " + dataToLocalDate.apply(date));
        System.out.println("Date to LocalData: " + dateLocalTime.apply(date));
        System.out.println("Date to LocalData: " + dateLocalDateTime.apply(date));
    }
}
