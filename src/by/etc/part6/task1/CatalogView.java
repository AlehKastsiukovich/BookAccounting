package by.etc.part6.task1;


public class CatalogView {

    public static void showCatalog(Catalog catalog) {
        for (int i = 0; i < catalog.getBookList().size(); i++) {
            System.out.println(i + " " + catalog.getBookList().get(i));
        }
    }
}
