public class Main {


    public static void main(String[] args) {
        Book toKillAMockingbird = new Book("toKillAMockingbird", 1961, "Pavel Sanaev");
        Book buryMeBehindTheBaseboard = new Book("buryMeBehindTheBaseboard", 1995, "Harper Lee");
        System.out.println("Название книги = " + buryMeBehindTheBaseboard.getBookTitle() + ". Год издания = " + buryMeBehindTheBaseboard.getYearBook() + ". Автор книги " + buryMeBehindTheBaseboard.getAuthor());
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + ". Год издания = " + toKillAMockingbird.getYearBook() + ". Автор книги " + toKillAMockingbird.getAuthor());
        toKillAMockingbird.setYearBooks(1960);
        System.out.println("Название книги = " + toKillAMockingbird.getBookTitle() + " .Исправление даты издания " + toKillAMockingbird.getYearBook() + ". Автор книги " + toKillAMockingbird.getAuthor());
    }
}