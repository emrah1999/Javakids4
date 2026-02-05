package lesson30Dates;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println("Current time: " + time);
        LocalTime specificTime=LocalTime.of(14,30,45,2323);
        System.out.println("Specific time: " + specificTime);
        System.out.println(time.plusHours(3).plusMinutes(15));

        System.out.println(time.getHour());
        System.out.println(time.getMinute());

    }
}
