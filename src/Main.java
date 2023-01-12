public class Main {


    public static void main(String[] args) {
        Book toKillAMockingbird = new Book("toKillAMockingbird", 1961);
        Author pavel_sanaev = new Author("Pavel Sanaev");
        Author harperLee = new Author("Harper Lee");
        Book buryMeBehindTheBaseboard = new Book("buryMeBehindTheBaseboard", 1995);
        System.out.println("Название книги = " + buryMeBehindTheBaseboard.getBookTitle() + ". Год издания = " + buryMeBehindTheBaseboard.getYearBook() + ". Автор книги " + pavel_sanaev.getAuthor());
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + ". Год издания = " + toKillAMockingbird.getYearBook() + ". Автор книги " + harperLee.getAuthor());
        toKillAMockingbird.setYearBooks(1960);
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + " .Исправление даты издания " + toKillAMockingbird.getYearBook() + ". Автор книги " + harperLee.getAuthor());
    }
}