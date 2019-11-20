package by.etc.part6.task1;


public class ElectronicBook extends Book {
    private EBookFormat eBookFormat;

    public ElectronicBook() {

    }

    public ElectronicBook(
            String title,
            String author,
            String publishingHouse,
            int numberOfPages,
            Language language,
            EBookFormat eBookFormat
    ) {
        super(title, author, publishingHouse, numberOfPages, language);
        this.eBookFormat = eBookFormat;
    }

    public EBookFormat geteBookFormat() {
        return eBookFormat;
    }

    public void seteBookFormat(EBookFormat eBookFormat) {
        this.eBookFormat = eBookFormat;
    }
}
