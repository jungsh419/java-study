package javaMid1.lang.object.poly;

import javaMid1.lang.object.ObjectMain;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();


        action(dog);
        action(car);
    }
    private static void action(Object object)
    {
        //object.sound(); // 둘다 컴파일 오류, Object는 sound()가 없다.
        //object.move();

        // 객체에 맞는 다운캐스팅이 필요

        if(object instanceof Dog dog)
        {
            dog.sound();
        }
        else if (object instanceof  Car) // 위와 동일한 코드
        {
            ((Car)object).move();
        }
    }
}
