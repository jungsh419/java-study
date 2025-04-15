package javaMid1.lang.enumeration.enumerationEx;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("당신의 등급을 입력하세요[[GUEST, LOGIN, ADMIN]: ");
        String level = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(level.toUpperCase());

        authGrade.printInfo();
        authGrade.getDescription();

//        if(AuthGrade.GUEST.name().equals(authGrade) )
//        {
//            System.out.println(authGrade);
//        } else if (AuthGrade.LOGIN.name().equals(authGrade))
//        {
//            System.out.println(authGrade);
//        }
//        else if(AuthGrade.ADMIN.name().equals(authGrade))
//        {
//            System.out.println(authGrade);
//        }


    }
}
