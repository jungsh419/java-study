package javaMid1.lang.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {

        int year = 2024;
        int month = 1;

        LocalDate time = LocalDate.of(year,month,1);
        DayOfWeek firstDayofWeek = time.getDayOfWeek();

        DayOfWeek lastDayofWeek = time.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayofWeek);
        System.out.println("lastDayOfWeek = " + lastDayofWeek);
    }
}
