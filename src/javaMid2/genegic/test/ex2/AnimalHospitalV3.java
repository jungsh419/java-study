package javaMid2.genegic.test.ex2;

import javaMid2.genegic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;
    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public void checkUp()
    {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        // Animal을 상속 받음으로 쓸 수 있음
        // 컴파일 가능!
        System.out.println("동물 이름 :"+animal.getName());
        System.out.println("동물 크기 :"+animal.getSize());
        animal.sound();
    }
    public T bigger(T target)

    {
        // Animal을 상속 받음으로 쓸 수 있음
        return animal.getSize() > target.getSize() ? animal:target;
    }
}
