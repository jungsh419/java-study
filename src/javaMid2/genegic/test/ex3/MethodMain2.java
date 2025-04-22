package javaMid2.genegic.test.ex3;

import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 1000);
        Cat cat = new Cat("애옹이",1000);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog bigDog = new Dog("왕 큰 멍멍이", 100000);
        Dog biggerDog = AnimalMethod.bigger(dog, bigDog);
        //Dog biggerDog1 = AnimalMethod.bigger(dog, cat); -> Dog로 타입지정이 되어서 Cat사용불가
        System.out.println("biggerDog = " + biggerDog);

    }
}
