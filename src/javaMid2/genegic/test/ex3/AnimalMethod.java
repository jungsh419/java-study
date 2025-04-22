package javaMid2.genegic.test.ex3;

import javaMid2.genegic.animal.Animal;

public class AnimalMethod {
    public static <T extends Animal> void checkUp(T t)
    {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        // Animal을 상속 받음으로 쓸 수 있음

        // 컴파일 가능!
        System.out.println("동물 이름 :"+t.getName());
        System.out.println("동물 크기 :"+t.getSize());
        t.sound();
    }


    public static <T extends Animal> T bigger(T t1, T t2)

    {
        // Animal을 상속 받음으로 쓸 수 있음
        return t1.getSize() > t2.getSize() ? t1:t2;

    }
}
