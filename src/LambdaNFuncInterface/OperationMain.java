package LambdaNFuncInterface;

public class OperationMain {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        System.out.println(calculator(add, 5, 6));
    }
    static int calculator(Operation operation, int a, int b) {
        return operation.add(a, b);
    }
}
