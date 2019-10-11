package by.etc.part6.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private static List<Book> bookList = new ArrayList<>();
    private File file;

    public Catalog() {
        file = new File("file.txt");
        this.file = file;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void showCatalog() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(i + " " + bookList.get(i));
        }
    }

    public void writeCatalog(List<Book> books) {
        file.delete();
        file = new File("file.txt");

        for(Book b: bookList) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write(b.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
