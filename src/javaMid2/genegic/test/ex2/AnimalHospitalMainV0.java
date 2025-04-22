package javaMid2.genegic.test.ex2;

import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class AnimalHospitalMainV0
{
    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("애옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog1);
        dogHospital.checkUp();

        catHospital.setAnimal(cat1);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.setAnimal(cat1); 다른 타입 입력시 컴파일오류

        // 문제2: 개 타입 반환
        //dogHospital.setAnimal(dog1);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 5000));
        System.out.println("biggerDog = " + biggerDog);

    }

}
