package javabasic.poly3;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void fly() {

        System.out.println("닭 날기");
    }
    public void sound()
    {

        System.out.println("꼬끼오");
    }
}
