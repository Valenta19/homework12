public class Book {
    private String bookTitle;
    private int yearBook;

    public Book(String bookTitle, int yearBook) {

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
}

