package by.etc.part6.task1;

public class ClientView {

    public void printClient(Client client) {
        System.out.println("Client{" +
                "name='" + client.getName() + '\'' +
                ", age=" + client.getAge() +
                ", passportNum='" + client.getPassportNum() + '\'' +
                ", userEmail='" + client.getUserEmail() + '\'' +
                ", login='" + client.getLogin() + '\'' +
                '}');
    }
}
