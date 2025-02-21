package Encapsulation;

public class Encapsulation {
    public int publicVar = 24;
    protected int protectedVar = 12; //child class can get this protected var
    private String name;
    private String email;

    public Encapsulation(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Encapsulation() {
        this.name = "default-name";
        this.email = "default-email";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display() {
        System.out.println("parent" + this.name);
    }
}
