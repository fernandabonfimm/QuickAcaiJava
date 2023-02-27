package classes.administrator;

public class Administrator {
    private String name;
    private String email;
    private String password;
    private int adminID;

    public Administrator(String name, String email, String password, int adminID) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

}
