package by.etc.part6.task1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CatalogLogic {

    public void writeCatalog(Catalog catalog, List<Book> books) {
        catalog.getFile().delete();
        catalog.setFile(new File("file.txt"));

        for (Book book : catalog.getBookList()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(catalog.getFile(), true))) {
                bw.write(book.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
