package by.etc.part6.task1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AdministratorLogic {

    public void addBook(Administrator administrator, Book book) {
        administrator.getCatalog().getBookList().add(book);
        new CatalogLogic().writeCatalog(administrator.getCatalog(), administrator.getCatalog().getBookList());

        for (Client client : administrator.getClientList()) {
            System.out.println("New book added and send to mail : " + client.getUserEmail() + ". Book info: " + book.toString());
        }
    }

    public void removeBook(Administrator administrator) {
        CatalogView.showCatalog(administrator.getCatalog());

        System.out.println("Choose number of book to remove: ");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Choose number of book to remove: ");
        }

        int number = scanner.nextInt();

        administrator.getCatalog().getBookList().remove(number);
        new CatalogLogic().writeCatalog(administrator.getCatalog(), administrator.getCatalog().getBookList());
        CatalogView.showCatalog(administrator.getCatalog());
    }

    public void addClient(Administrator adm, Client client) {
        adm.getClientList().add(client);
    }

    public void addAuthData(Administrator adm, Client client) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(adm.getUserAuthentification(), true))) {
            bw.write(client.getLogin() + "\t");
            String pass = Encrypter.encryptPass(client);
            bw.write(pass + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void acceptUsersBooks(Administrator adm, Book book) {
        System.out.println("Book to propose is " + book.toString());
        String decision = null;

        System.out.println("Do you want to add this book? yes/no");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        decision = scanner.nextLine();

        if (decision.equals("yes")) {
            addBook(adm, book);
        } else {
            System.out.println("book does not added!");
        }
    }
}
