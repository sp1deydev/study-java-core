package LambdaNFuncInterface;

public class LambdaExpression {
    public static void main(String[] args) {
//        Cat cat = new Cat("Kitty");
//        printThing(cat);
        Printable test = s -> s + " meow meow";
//        printThing(
//            () -> {
//                System.out.println(" meow meow");
//            }
//        );
        printThing(test);
        System.out.println(printThing(test));
    }
    static String printThing(Printable printable) {
        return printable.print("Kitty");
    }
}

