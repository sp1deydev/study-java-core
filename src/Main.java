public class Main {
    int x = 5;
    int y = 10;

    public static void helloMethod() {
        System.out.println("Hello word");
    }

    public static void main(String[] args) {
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        helloMethod();
    }
}