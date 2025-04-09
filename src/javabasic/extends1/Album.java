package javabasic.extends1;

public class Album extends Item{
    String artist;


    Album(String name, int price, String artist)
    {
        super.name = name;
        super.price = price;
        this.artist = artist;

    }
    @Override
    public void print()
    {
        System.out.println("이름 : " + name + ", 가격 : "+ price);
        System.out.println("아티스트 : " + this.artist);

    }
}
