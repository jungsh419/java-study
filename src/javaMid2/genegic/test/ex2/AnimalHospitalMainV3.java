package javaMid2.genegic.test.ex2;

import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();


        Dog dog1 = new Dog("멍멍이1", 100);
        Cat cat1 = new Cat("애옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog1);
        dogHospital.checkUp();

        catHospital.setAnimal(cat1);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달   -> Animal 클래스를 매개로 받으면 Dog를 넣어야할 부분에 Cat을 넣어도 컴파일 오류가 생기지 않았음
        // dogHospital.setAnimal(cat1); // 매개변수를 Dog타입으로 받기 때문에 컴파일 오류가 생김 !!!   매개변수 체크 성공!!!

        // 문제2: 개 타입 반환
        //Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 5000));
        // Animal 클래스로 반환 되는게 아닌 Animal을 상속받은 T타입이기 때문에 사용 가능
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 5000));

        System.out.println("biggerDog = " + biggerDog);

    }
}
