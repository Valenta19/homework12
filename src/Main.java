public class Main {


    public static void main(String[] args) {
        Author pavel_Sanaev = new Author("Pavel Sanaev");
        Author harper_Lee = new Author("Harper Lee");
        Book toKillAMockingbird = new Book("toKillAMockingbird",pavel_Sanaev, 1961);
        Book buryMeBehindTheBaseboard = new Book("buryMeBehindTheBaseboard", harper_Lee,1995);
        System.out.println("Название книги = " + buryMeBehindTheBaseboard.getBookTitle() + ". Год издания = " + buryMeBehindTheBaseboard.getYearBook() + ". Автор книги " +buryMeBehindTheBaseboard.getAuthor().getName());
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + ". Год издания = " + toKillAMockingbird.getYearBook() + ". Автор книги " + toKillAMockingbird.getAuthor().getName());
        toKillAMockingbird.setYearBooks(1960);
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + " .Исправление даты издания " + toKillAMockingbird.getYearBook() + ". Автор книги " + toKillAMockingbird.getAuthor().getName());
    }
}