package by.etc.part6.task1;


public class ElectronicBookView {

    public static void printBook(ElectronicBook book) {
        System.out.println(book.getTitle() + "/" + book.getAuthor() + "/"
                + book.getPublishingHouse() + "/" + book.getNumberOfPages() + "/"
                + book.getLanguage()  + "/" + book.geteBookFormat());
    }

    public static String bookView(ElectronicBook book) {
        return book.getTitle() + "/" + book.getAuthor() + "/"
                + book.getPublishingHouse() + "/" + book.getNumberOfPages() + "/" + book.getLanguage() + "/" +
                book.geteBookFormat();
    }
}
