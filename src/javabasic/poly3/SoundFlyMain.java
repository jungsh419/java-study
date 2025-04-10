package javabasic.poly3;

import javabasic.poly.Child;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        sound(dog);
        sound(bird);
        sound(chicken);

        fly(bird);
        fly(chicken);

    }
    private static void sound(AbstractAnimal ani)
    {
        System.out.println("동물 소리 테스트 시작");
        ani.sound();
        System.out.println("동물 소리 테스트 종료");

    }
    private static void fly(Fly ani)
    {
        System.out.println("동물 날기 테스트");
        ani.fly();

    }

}
