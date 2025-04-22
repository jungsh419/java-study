package javaMid2.genegic.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("초코", 30);
        Cat cat = new Cat("애옹이", 30);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        Dog findog = dogBox.getValue();
        System.out.println("finding = " + findog);

        Box<Cat> catBox  = new Box<>();
        catBox.setValue(cat);
        Cat findCat = catBox.getValue();
        System.out.println("findCat = " + findCat.toString());


        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        Animal findAnimal = animalBox.getValue();
        System.out.println("findAnimal = " + findAnimal.toString());
    }
}
