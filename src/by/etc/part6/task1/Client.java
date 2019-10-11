package by.etc.part6.task1;


import java.util.Scanner;

public class Client {
    private String name;
    private int age;
    private String passportNum;
    private String userEmail;
    private String login;
    private String password;
    private Catalog catalog;

    public Client(String name, int age, String passportNum, String userEmail, Catalog catalog) {
        this.name = name;
        this.age = age;
        this.passportNum = passportNum;
        this.userEmail = userEmail;
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passportNum='" + passportNum + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void watchCatalog() {
        catalog.showCatalog();
    }

    public void findBookByTitle(Catalog catalog) {
        Scanner scanner = new Scanner(System.in);
        String enterTitle = scanner.nextLine();

        for (Book b: catalog.getBookList()) {
            if (b.getTitle().equals(enterTitle)) {
                System.out.println("Your book is " + b.toString());
            }
        }
    }

    public void findBookByAuthor(Catalog catalog) {
        Scanner scanner = new Scanner(System.in);
        String enterAuthor = scanner.nextLine();

        for (Book b: catalog.getBookList()) {
            if (b.getAuthor().equals(enterAuthor)) {
                System.out.println("Your book is " + b.toString());
            }
        }
    }

    public Book proposeBook(Book book) {
        System.out.println("My propose send to mail : " + Administrator.getEmail() +" . Book info: " + book.toString());
        return book;
    }
}
