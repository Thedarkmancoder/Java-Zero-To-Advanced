// Base class
package main_java26;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Some generic animal sound...");
    }

    public void move() {
        System.out.println(name + " is moving...");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void move() {
        // Call parent move() first
        super.move();
        // Add Dog-specific behavior
        System.out.println(name + " runs quickly on four legs!");
    }

    // Extra method unique to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Sheru");
        d.sound();   // overridden sound()
        d.move();    // overridden move() with super.move()
        d.fetch();   // Dog-specific method
    }
}
// Output:- 
// Sheru says: Woof!
// Sheru is moving...
// Sheru runs quickly on four legs!
// Sheru is fetching the ball!