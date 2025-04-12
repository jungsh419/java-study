package javaMid1.lang.object.poly;

import javaMid1.lang.object.ObjectMain;

public class ObjectPolyExample2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object();

        Object[] objs = {dog, car, o};
        size(objs);


    }

    private static void size(Object[] objs) {
        System.out.println("전달된 객체의 수는 : " + objs.length);
    }
}
