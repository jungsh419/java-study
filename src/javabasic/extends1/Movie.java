package javabasic.extends1;

public class Movie extends Item{
    String dircetor;
    String actor;

    Movie(String name, int price, String dircetor, String actor)
    {
        this.name = name;
        this.price = price;
        this.dircetor = dircetor;
        this.actor = actor;
    }
    @Override
    public void print()
    {
        System.out.println("이름 : " + name + ", 가격 : "+ price);
        System.out.println("감독 : " + this.dircetor + ", 배우 : "+ this.actor);

    }
}
