package javaMid2.genegic.test.ex5;

import javaMid2.genegic.animal.Animal;

public class WildCard {


    static <T> void printGeneric(Box<T> box)
    {
        System.out.println("T = " + box.getValue());
    }
    static void printWildCardV1(Box<?> box)
    {
        System.out.println("? : "+ box.getValue());
    }



    static void printWildCardV2(Box<? extends Animal> box)
    {
        Animal ani = box.getValue();
        System.out.println("이름 : "+ ani.getName());
    }
    static <T extends Animal> void printGeneric2(Box<T> box)
    {
        T t =box.getValue();
        System.out.println("이름 :"+t.getName());
    }



    static <T extends Animal> T printAndReturnGeneric(Box<T> box)
    {
        T t =box.getValue();
        System.out.println("이름 :"+t.getName());
        return t;

    }
    static Animal printAndReturnWildCard(Box<? extends Animal> box)
    {
        Animal animal = box.getValue();
        System.out.println("이름 :"+animal.getName());
        return animal;
    }


}
