package javabasic.final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name)
    {
        this.id = id;
        this.name = name;

    }

    public void changeData(String id, String name)
    {
        //this.id = id; // final을 바꾸려해서 오류 발생
        this.name = name;
    }

    public void print()
    {
        System.out.println("id : " + this.id + " name : " + this.name);
    }

}
