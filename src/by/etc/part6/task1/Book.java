package by.etc.part6.task1;


public class Book {
    private String title;
    private String author;
    private String publishingHouse;
    private int numberOfPages;
    private Language language;

    public Book() {

    }

    public Book(String title, String author, String publishingHouse,
                int numberOfPages, Language language) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String toString() {
        return title +"/" + author + "/" + publishingHouse + "/" + numberOfPages + "/" + language;
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (this.getClass() != object.getClass())
            return false;
        Book book = (Book) object;
        if (!title.equals(book.title))
            return false;
        if (!author.equals(book.author))
            return false;
        if (!publishingHouse.equals(book.publishingHouse))
            return false;
        if (numberOfPages != book.numberOfPages)
            return false;
        if (language != book.language)
            return false;
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberOfPages;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
}
