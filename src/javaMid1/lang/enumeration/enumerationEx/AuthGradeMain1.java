package javaMid1.lang.enumeration.enumerationEx;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();

        for(AuthGrade grade : grades)
        {
            grade.printInfo();
        }

    }
}
