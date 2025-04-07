package javabasic.pack2;

public class User {
    String name;
    int age;

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
