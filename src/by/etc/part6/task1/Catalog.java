package by.etc.part6.task1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> bookList = new ArrayList<>();
    private File file;

    public Catalog(List<Book> list, File file) {
        bookList = list;
        this.file = file;
    }

    public Catalog() {
        file = new File("file.txt");
        this.file = file;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
