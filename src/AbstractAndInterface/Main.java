package AbstractAndInterface;

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(this.name + " bark woof woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();
    }
}
