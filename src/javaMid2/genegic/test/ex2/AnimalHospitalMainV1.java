package javaMid2.genegic.test.ex2;

import javaMid2.genegic.animal.Animal;
import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();


        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("애옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog1);
        dogHospital.checkUp();

        catHospital.setAnimal(cat1);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.setAnimal(cat1); // 매개변수를 Animal타입으로 받기 때문에 컴파일 오류가 생기지 않음 !!!   매개변수 체크 실패  !!!

        // 문제2: 개 타입 반환
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 5000));
        System.out.println("biggerDog = " + biggerDog);

    }
}
