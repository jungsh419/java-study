package javabasic.Pack;

public class User {

    public String name = "";
    public int age = 0;


    public User(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public void UserInfo()
    {
        System.out.println("이름 : " + name + " 나이 : " + age);
    }


}
