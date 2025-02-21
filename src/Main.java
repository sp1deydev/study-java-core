import StringAndDate.*;
import Encapsulation.*;

public class Main {
    public static void main(String[] args) {
        ChildEncapsulation childEn = new ChildEncapsulation();
        childEn.setName("new name set");
        childEn.display();
        childEn.displayVariables();
    }
}