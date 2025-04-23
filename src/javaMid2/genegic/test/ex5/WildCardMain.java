package javaMid2.genegic.test.ex5;

import javaMid2.genegic.animal.Animal;
import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class WildCardMain {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이",100));
        catBox.setValue(new Cat("애옹이",50));

        WildCard.printGeneric(dogBox);
        WildCard.printWildCardV1(dogBox);

        //WildCard.printGeneric(catBox);

        WildCard.printGeneric2(dogBox);
        WildCard.printWildCardV2(dogBox);

        Dog dog = WildCard.printAndReturnGeneric(dogBox);
        Animal animal = (Dog) WildCard.printAndReturnWildCard(dogBox);



    }
}
