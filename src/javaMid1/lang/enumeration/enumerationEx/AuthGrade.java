package javaMid1.lang.enumeration.enumerationEx;

import java.util.Stack;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;


    private AuthGrade(int level, String description)
    {
        this.level = level;
        this.description = description;

    }

    public int getLevel()
    {
        return this.level;
    }

    public String getDescription() {
        return description;
    }

    public void printInfo()
    {
        System.out.println("grade : "+this.name() + " level : "+ this.level+ " 설명 : "+
                this.description);
    }
}
