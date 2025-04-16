package javaMid1.lang.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestBetween {
    public static void main(String[] args) {

        LocalDate now =  LocalDate.of(2025,04,16);
        LocalDate endDate = LocalDate.of(2025, 4, 20);

        Period period =  Period.between(now,endDate);
        long daysBetween = ChronoUnit.DAYS.between(now,endDate);

        System.out.println("시작 날짜 : "+now);
        System.out.println("종료 날짜 : "+ endDate);
        System.out.println("남은 기간 : "+period.getYears() + "년" + period.getMonths()+"달"+period.getDays()+"일");
        System.out.println("디데이 : "+ daysBetween+"일 남음");





    }
}
