package javabasic.poly2;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        // AbstractAnimalMain animal = new AbstractAnimalMain();
        // 생성 불가
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();


//        soundAnimal(cat);
//        soundAnimal(dog);
//        soundAnimal(cow);
//
//        moveAnimal(cat);
//        moveAnimal(dog);
//        moveAnimal(cow);


    }
    private static void soundAnimal(AbstractAnimal ani)
    {
        ani.sound();
    }
    private  static void moveAnimal(AbstractAnimal ani)
    {
        ani.move();
    }


}
