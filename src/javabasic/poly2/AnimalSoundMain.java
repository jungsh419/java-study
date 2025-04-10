package javabasic.poly2;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("-------------------");
        //soundAnimal(dog); // Animal animal = dog로 이해하면 된다.
        //soundAnimal(cat);
        //soundAnimal(cow);

        System.out.println("-------------------");
        //Animal[] animalArr = {dog, cat, cow};
        //for(Animal ani : animalArr)
        //{soundAnimal(ani);}

    }

    private static void soundAnimal(Animal animal)
    {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
