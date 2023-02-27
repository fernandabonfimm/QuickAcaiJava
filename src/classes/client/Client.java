package classes.client;

public class Client {
    private String name;
    private String address;
    private String phone;
    private String email;
    private int clientID;
    private String password;

    public Client(String name, String address, String phone, String email, String string, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.clientID = clientID;
        this.password = password;
    }

    // getters e setters para acessar os atributos

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getClientID() {
        return clientID;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
