package javabasic.extends1;

public class Book extends Item{
    String author;
    String isbn;

    Book(String name, int price, String author, String isbn)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    public void print()
    {
        System.out.println("이름 : " + name + ", 가격 : "+ price);
        System.out.println("저자 : " + this.author + ", isbn : "+ this.isbn);

    }
}
