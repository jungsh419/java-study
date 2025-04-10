package javabasic.poly3;

public class Bird extends AbstractAnimal implements Fly{

    @Override
    void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }
}
