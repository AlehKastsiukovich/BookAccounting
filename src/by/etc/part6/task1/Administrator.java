package by.etc.part6.task1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Administrator {
    private Catalog catalog;
    private static List<Client> clientList;
    private static File userAuthentification;
    private static String email;

    public Administrator(Catalog catalog) {
        this.catalog = catalog;
        userAuthentification = new File("authentication.txt");
        clientList = new ArrayList<>();
        email = "administrator@gmail.com";
    }

    public static String getEmail() {
        return email;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void addBook(Book book) {
        catalog.getBookList().add(book);
        catalog.writeCatalog(catalog.getBookList());

        for (Client cl : clientList) {
            System.out.println("New book added and send to mail : " + cl.getUserEmail() +". Book info: " + book.toString());
        }
    }

    public void removeBook() {
        catalog.showCatalog();

        System.out.println("Choose number of book to remove: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        catalog.getBookList().remove(number);
        catalog.writeCatalog(catalog.getBookList());
        catalog.showCatalog();
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void addAuthData(Client client) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(userAuthentification, true))) {
            bw.write(client.getLogin() + "\t");
            String pass = Encrypter.encryptPass(client);
            bw.write(pass + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void acceptUsersBooks(Book book) {
        System.out.println("Book to propose is "+book.toString());
        String decision = null;

        System.out.println("Do you want to add this book?");
        Scanner scanner = new Scanner(System.in);
        decision = scanner.nextLine();

        if (decision.equals("yes")) {
            addBook(book);
        } else {
            System.out.println("book does not added!");
        }
    }
}
