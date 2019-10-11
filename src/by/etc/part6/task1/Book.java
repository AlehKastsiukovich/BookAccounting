package by.etc.part6.task1;


public class Book {
    private String  title;
    private String author;
    private String publishingHouse;
    private int numberOfPages;
    private Language language;

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

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return    title +"/" + author + "/" + publishingHouse + "/" + numberOfPages + "/" + language;
    }
}
