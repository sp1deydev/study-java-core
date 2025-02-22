package AbstractAndInterface.Interface;

class Cat implements Animal, Pet {
    String name;
    Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " say meow meow");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping.");
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.makeSound();
        cat.sleep();
        cat.play();
    }
}
