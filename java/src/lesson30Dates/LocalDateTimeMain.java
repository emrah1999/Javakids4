package lesson30Dates;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        System.out.println("Today is: " + today);
        LocalDateTime specifDay=LocalDateTime.of(2020, 5, 15, 10, 30);
        System.out.println("Specific day is: " + specifDay);
        System.out.println(LocalDateTime.parse("2023-08-20T14:45:00"));
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonthValue());
        System.out.println("Day: " + today.getDayOfMonth());
        System.out.println("Hour: " + today.getHour());
        System.out.println("Minute: " + today.getMinute());
        System.out.println(today.plusHours(5).plusMinutes(40));

        System.out.println(today.minusYears(2).minusDays(10));

        System.out.println(today.isEqual(specifDay));


        DateTimeFormatter dateFormatter=DateTimeFormatter .ofPattern("dd MM yyyy HH:mm:ss");
        String formatDate= today.format(dateFormatter);
        System.out.println("Formatted date: " + formatDate);
    }

}
