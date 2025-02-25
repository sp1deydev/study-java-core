package LambdaNFuncInterface;

public class Cat implements Printable {
    String name;
    Cat(String name) {
        this.name = name;
    }
    @Override
    public String print(String name) {
       return name + " meow meow";
    }
}
