public class Book {
    private String bookTitle;
    private int yearBook;

    private String Author;
    public Book(String bookTitle, int yearBook, String Author) {

        this.bookTitle = bookTitle;
        this.yearBook = yearBook;
        this.Author = Author;

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
        return this.Author;
    }
}


