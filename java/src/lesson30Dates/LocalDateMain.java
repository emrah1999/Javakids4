package lesson30Dates;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        Long millseconds=System.currentTimeMillis();
        System.out.println(millseconds);

        LocalDate today=LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate adiGun=LocalDate.of(1852,2,15);
        System.out.println("Adi gun: " + adiGun);

        LocalDate textDate=LocalDate.parse("2024-06-15");
        System.out.println("Text date: " + textDate);

        System.out.println("Year "+today.getYear());
        System.out.println("Month "+today.getMonth());
        System.out.println("Day "+today.getDayOfMonth());
        System.out.println("Day of week "+today.getDayOfWeek());

        System.out.println(today.plusDays(102));


        if(today.isAfter(adiGun)){
            System.out.println("Today is after adi gun");
        }

        if(adiGun.isBefore(today)){
            System.out.println("Adi gun is before today");
        }

        System.out.println(today.plusYears(2).isLeapYear());
    }
}
