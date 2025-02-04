// Define an interface
interface Animal {
    void makeSound();
    void eat();
}

// Defin an abstract class that implement the interface
abstract class Mammal implements Animal {
    String name;

    Mammal(String name) {
        this.name = name;
    }

    // Abstract methode
    abstract void move();

    // Concrete methode
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Defin a concrete class that extends the abstract class
class Dog extends Mammal {
    Dog(String name) {
        super(name);
    }

    // Implement the abstract methode
    @Override
    void move() {
        System.out.println(name + " is running.");
    }

    // Implement the interface methodes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Define another concrete class that extends the abstract class
class Cat extends Mammal {
    Cat(String name) {
        super(name);
    }

    // Implement the abstract methode
    @Override
    void move() {
        System.out.println(name + " is jumping.");
    }

    // Implement the interface methodes
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Test the implementation
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Test Dog methodes
        dog.makeSound();
        dog.eat();
        dog.move();
        dog.sleep();

        // Test Cat methodes
        cat.makeSound();
        cat.eat();
        cat.move();
        cat.sleep();
    }
}
