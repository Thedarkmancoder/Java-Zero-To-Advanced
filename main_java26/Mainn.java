// Base class
package main_java26;

class Device1 {
    // Instance initializer block
    {
        System.out.println("Device instance block executed");
    }

    // Constructor
    public Device1() {
        System.out.println("Device constructor executed");
    }
}

// Derived class
class Computer extends Device1 {
    {
        System.out.println("Computer instance block executed");
    }

    public Computer() {
        System.out.println("Computer constructor executed");
    }
}

// Further derived class
class Laptop extends Computer {
    {
        System.out.println("Laptop instance block executed");
    }

    public Laptop() {
        System.out.println("Laptop constructor executed");
    }
}

// Main class
public class Mainn {
    public static void main(String[] args) {
        System.out.println("Creating Laptop object...");
        Laptop l = new Laptop();
        l.toString();
    }
}
// Output:-
// Creating Laptop object...
// Device instance block executed
// Device constructor executed
// Computer instance block executed
// Computer constructor executed
// Laptop instance block executed
// Laptop constructor executed