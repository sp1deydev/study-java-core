package PassByValueOrReference;

public class PassByValue {
    static void changeValue(int x, String str) {
        x = 10;
        str = "init";
        System.out.println("Giá trị bên trong phương thức: " + x);
        System.out.println("Giá trị bên trong phương thức: " + str);
    }

    public static void main(String[] args) {
        int a = 5;
        String str = "main";
        System.out.println("Giá trị ban đầu: " + a);
        System.out.println("Giá trị ban đầu: " + str);
        changeValue(a, str);
        System.out.println("Giá trị sau khi gọi phương thức: " + a);
        System.out.println("Giá trị sau khi gọi phương thức: " + str);
    }
}