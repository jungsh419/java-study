package javaMid1.lang.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1),
                LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));

        System.out.println(seoulTime);


    }
}
