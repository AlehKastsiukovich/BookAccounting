package by.etc.part6.task1;


import java.util.Scanner;

public class ClientLogic {

    public void watchCatalog(Catalog catalog) {
        CatalogView.showCatalog(catalog);
    }

    public void findBookByTitle(Catalog catalog) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String enterTitle = scanner.nextLine();

        for (Book book : catalog.getBookList()) {

            if (book.getTitle().equals(enterTitle)) {
                System.out.println("Your book is " + book.toString());
            }
        }
    }

    public void findBookByAuthor(Catalog catalog) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String enterAuthor = scanner.nextLine();

        for (Book book : catalog.getBookList()) {

            if (book.getAuthor().equals(enterAuthor)) {
                System.out.println("Your book is " + book.toString());
            }
        }
    }

    public Book offerBook(Client client, Book book, Administrator adm) {
        System.out.println("My offer send to mail : " + adm.getEmail() + " . Book info: " + book.toString());
        return book;
    }
}
