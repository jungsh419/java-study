package javaMid2.genegic.test.ex3;

import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("애옹이",300);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
