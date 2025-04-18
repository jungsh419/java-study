package javaMid1.nested.nested.test;

public class Library {

    private Book[] books;
    private int count = 0;
    public Library(int bookCount)
    {
        books = new Book[bookCount];
    }
    public void addBook(String bName, String bAuthor)
    {
        if(count<books.length)
        {
            Book book = new Book(bName,bAuthor);
            books[count] = book;
            count++;

        }
        else
        {
            System.out.println("도서관이 꽉참");
        }
    }
    public void showBooks()
    {
        System.out.println("== 책 목록 출력 ==");
        for(Book book : books)
        {
            System.out.println(book.bookName + ", "+ book.author);

        }
    }
    private class Book
    {
        private String bookName;
        private   String author;

        private Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }


}
