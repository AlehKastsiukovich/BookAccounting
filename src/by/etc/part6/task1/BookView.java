package by.etc.part6.task1;


public class BookView {

    public static void printBook(Book book) {
        System.out.println(book.getTitle() + "/" + book.getAuthor() + "/"
                + book.getPublishingHouse() + "/" + book.getNumberOfPages() + "/" + book.getLanguage());
    }

    public static String bookView(Book book) {
        return book.getTitle() + "/" + book.getAuthor() + "/"
                + book.getPublishingHouse() + "/" + book.getNumberOfPages() + "/" + book.getLanguage();
    }
}
