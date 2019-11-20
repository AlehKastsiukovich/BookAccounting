package by.etc.part6.task1;


import java.io.Serializable;

public class PaperBook extends Book implements Serializable {
    boolean coverIsSoft;

    public PaperBook() {

    }

    public PaperBook(
            String title,
            String author,
            String publishingHouse,
            int numberOfPages,
            Language language,
            boolean coverIsSoft) {
        super(title, author, publishingHouse, numberOfPages, language);
        this.coverIsSoft = coverIsSoft;
    }

    public boolean isCoverIsSoft() {
        return coverIsSoft;
    }

    public void setCoverIsSoft(boolean coverIsSoft) {
        this.coverIsSoft = coverIsSoft;
    }
}
