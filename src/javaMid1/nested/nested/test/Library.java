package javaMid1.nested.nested.test;



public class Library {
    private Book[] Books;
    private int count;

    public Library(int count)
    {
        Books= new Book[count];
        this.count = 0;

    }

    public class Book
    {
        private String bookName;
        private String author;
        Book(String bookName,String author)
        {
            this.bookName = bookName;
            this.author = author;
        }

    }


    public void addBook(String bookName,String author) {
        if(Books.length <= count)
        {
            System.out.println("도서관 꽉참");
        }
        else {
            Book book = new Book(bookName, author);
            Books[count] = book;
            count++;
        }
    }

    public void showBooks()
    {
        for(Book book: Books)
        {
            System.out.println("제목 : "+ book.bookName + " 저자 : "+ book.author);

        }
    }


}
