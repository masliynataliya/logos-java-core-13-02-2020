package homework.romanivanov.jc21hw.Date;

import javax.xml.crypto.Data;
import java.time.*;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        dateToLocalTime();
        dateToLocalDate();
        dateToLocalDateTime();

    }

    public static void dateToLocalDateTime(){
        Date ts =new Date();
        Instant instant = Instant.ofEpochMilli(ts.getTime());
        LocalDateTime res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(res.toString());
    }

    public static void dateToLocalDate(){
        Date date = new Date();
        Instant instant = Instant.ofEpochMilli(date.getTime());
        LocalDate res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        System.out.println(res.toString());

    }

    public static void dateToLocalTime(){
        Date time = new Date();
        Instant instant = Instant.ofEpochMilli(time.getTime());
        LocalTime res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
        System.out.println(res.toString());
    }



}
