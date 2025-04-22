package javaMid2.genegic.test.ex2;
import javaMid2.genegic.animal.Cat;


public class CatHospital {
    private Cat animal;

    public Cat getAnimal() {
        return animal;
    }

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }

    public void checkUp()
    {
        System.out.println("동물 이름 :"+animal.getName());
        System.out.println("동물 크기 :"+animal.getSize());
        animal.sound();
    }
    public Cat bigger(Cat target)
    {
        return animal.getSize() > target.getSize() ? animal:target;
    }
}
