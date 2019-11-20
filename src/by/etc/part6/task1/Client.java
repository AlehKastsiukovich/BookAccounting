package by.etc.part6.task1;


public class Client {
    private String name;
    private int age;
    private String passportNum;
    private String userEmail;
    private String login;
    private String password;

    public Client() {

    }

    public Client(String name, int age, String passportNum, String userEmail) {
        this.name = name;
        this.age = age;
        this.passportNum = passportNum;
        this.userEmail = userEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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
}
