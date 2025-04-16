package javaMid1.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.of(2024,1,1,0,0,0);
        for(int i=0;i<5;i++)
        {
            //LocalDateTime future = time.plusWeeks(2*i);
            LocalDateTime future = time.plus(2*i, ChronoUnit.WEEKS);
            System.out.println(future);

        }
    }
}
