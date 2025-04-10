package javabasic.poly2;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound()
    {
        System.out.println("애옹");
    }
    public void move()
    {
        System.out.println("고양이가 움직입니다.");
    }
}
