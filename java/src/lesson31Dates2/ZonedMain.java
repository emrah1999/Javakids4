package lesson31Dates2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class ZonedMain {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime istanbulTime= ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
        System.out.println(istanbulTime);

        ZonedDateTime bakuTime =
                ZonedDateTime.now(ZoneId.of("Asia/Baku"));

        ZonedDateTime londonTime =
                bakuTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println(londonTime);
        System.out.println(bakuTime);

        System.out.println(bakuTime.getZone());

        LocalDate localDate=bakuTime.toLocalDate();
        LocalDateTime localDateTime=bakuTime.toLocalDateTime();
        LocalTime localTime=bakuTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        LocalDateTime localDateTime1=LocalDateTime.now();
        LocalDateTime localDateTime2=LocalDateTime.of(2024, 6, 1, 12, 0);

        Long dif=ChronoUnit.HOURS.between(localDateTime2, localDateTime1);
        System.out.println(dif);

        Locale locale=new Locale("tr", "TR");

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        LocalDate bir=LocalDate.of(2024, 6, 1);
        LocalDate iki=LocalDate.of(2024, 6, 1);
        System.out.println(bir.isAfter(iki));
    }
}
