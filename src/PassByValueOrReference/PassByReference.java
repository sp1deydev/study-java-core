package PassByValueOrReference;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void changeName(Person p) {
        p.name = "Alice";
    }
}

public class PassByReference {
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println("Trước khi gọi phương thức: " + person.name);

        person.changeName(person);

        System.out.println("Sau khi gọi phương thức: " + person.name);
    }
}
