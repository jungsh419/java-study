package javaMid2.genegic.test.ex5;

import javaMid2.genegic.animal.Animal;
import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class WildCardMain2 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달가능

        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox);  // 하한이 Animal
        //writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }
    static void writeBox(Box<? super Animal> box)
    {
         box.setValue(new Dog("멍뭉이", 100));
    }
}
