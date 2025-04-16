package javaMid1.lang.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2023, 3, 13);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);
        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(765);
        System.out.println("지정 날짜+10d = " + plusDays);
    }
}
