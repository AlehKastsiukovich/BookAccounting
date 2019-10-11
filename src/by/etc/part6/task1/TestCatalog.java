package by.etc.part6.task1;

public class TestCatalog {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Administrator administrator = new Administrator(catalog);

        Client client = new Client("Aleh", 25, "12345",
                "aleh@gmail.com", catalog);
        client.setLogin("Aleh");
        client.setPassword("pass123");
        Client client2 = new Client("Tanya", 25, "32222",
                "tanya@gmail.com", catalog);
        client2.setLogin("tanya");
        client2.setPassword("322");

        administrator.addClient(client);
        administrator.addAuthData(client);
        administrator.addClient(client2);
        administrator.addAuthData(client2);

        PaperBook paperBook1 = new PaperBook("It", "King", "noname", 800,
                Language.RUSSIAN, true);
        PaperBook paperBook2 = new PaperBook("It2", "King", "noname", 800,
                Language.RUSSIAN, true);

        administrator.addBook(paperBook1);

        administrator.acceptUsersBooks(client2.proposeBook(paperBook2));

        //client.findBookByTitle(catalog);
        //administrator.removeBook();
    }
}
