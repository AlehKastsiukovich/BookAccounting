package by.etc.part6.task1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Administrator {
    private String email;
    private Catalog catalog;
    private List<Client> clientList;
    private File userAuthentification;


    public Administrator() {

    }

    public Administrator(String email, Catalog catalog, List<Client> list, File auth) {
        this.email = email;
        this.catalog = catalog;
        clientList = list;
        userAuthentification = auth;
    }

    public Administrator(Catalog catalog) {
        email = "administrator@gmail.com";
        this.catalog = catalog;
        userAuthentification = new File("authentication.txt");
        clientList = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public File getUserAuthentification() {
        return userAuthentification;
    }

    public void setUserAuthentification(File userAuthentification) {
        this.userAuthentification = userAuthentification;
    }
}
