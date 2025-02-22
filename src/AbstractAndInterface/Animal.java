package AbstractAndInterface;

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();

    void sleep() {
        System.out.println(this.name + " is sleeping.");
    }
}
