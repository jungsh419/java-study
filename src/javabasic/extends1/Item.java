package javabasic.extends1;

public class Item {

    protected String name;
    protected int price;

    protected void print()
    {
        System.out.println("이름 : " + name + ", 가격 : "+ price);
    }

    protected int getPrice()
    {
        return price;

    }
}
