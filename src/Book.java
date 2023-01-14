public class Book {
    private String bookTitle;
    private int yearBook;
    private Author author;

    public Book(String bookTitle, Author author, int yearBook) {

        this.bookTitle = bookTitle;
        this.yearBook = yearBook;
        this.author = author;

    }
    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearBook() {
        return yearBook;
    }
    public void setYearBooks(int yearBook){
        this.yearBook = yearBook;
    }
    public Author getAuthor(){
        return author;
    }

}


