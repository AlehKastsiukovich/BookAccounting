package by.etc.part6.task1;


public class ElectronicBook extends Book {
    EBookFormat eBookFormat;

    public ElectronicBook(String title, String author, String publishingHouse,
                          int numberOfPages, Language language, EBookFormat eBookFormat) {
        super(title, author, publishingHouse, numberOfPages, language);
        this.eBookFormat = eBookFormat;
    }

    @Override
    public String toString() {
        return super.toString() + "/" +eBookFormat + "\n";
    }
}
