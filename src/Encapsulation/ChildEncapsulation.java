package Encapsulation;

public class ChildEncapsulation extends Encapsulation {
    public ChildEncapsulation() {
        super("test", "test1");
    }
    public void displayVariables() {
        System.out.println(super.protectedVar);
        System.out.println(super.publicVar);
        System.out.println(super.getName());
    }
    @Override
    public void display() {
        System.out.println("override");
    }
}
