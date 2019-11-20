package by.etc.part6.task1;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Administrator administrator = new Administrator(catalog);

        Client client = new Client("Aleh", 25, "BM12345", "aleh@gmail.com");
        client.setLogin("aleh");
        client.setPassword("pass123");
            Client client2 = new Client("Tanya", 25, "MP12345", "tanya@gmail.com");
        client2.setLogin("tanya");
        client2.setPassword("12345qaz");

        AdministratorLogic logic = new AdministratorLogic();

        logic.addClient(administrator, client);
        logic.addAuthData(administrator, client);
        logic.addClient(administrator, client2);
        logic.addAuthData(administrator, client2);

        PaperBook paperBook1 = new PaperBook("It", "King", "noname", 800,
                Language.RUSSIAN, true);
        PaperBook paperBook2 = new PaperBook("It2", "King", "noname", 800,
                Language.ENGLISH, true);

        logic.addBook(administrator, paperBook1);

        ClientLogic clientLogic = new ClientLogic();

        logic.acceptUsersBooks(administrator, clientLogic.offerBook(client2, paperBook2, administrator));
    }
}
