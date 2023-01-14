public class Book {
    private String bookTitle;
    private int yearBook;
    private String author;

    public Book(String bookTitle, int yearBook,String author) {

        this.author = author;
        this.bookTitle = bookTitle;
        this.yearBook = yearBook;

    }
    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBooks(int yearBook){
        this.yearBook = yearBook;
    }
    public String getAuthor() {

        return this.author;
    }
}


