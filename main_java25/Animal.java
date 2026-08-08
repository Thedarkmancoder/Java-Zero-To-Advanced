// Theory - Inheritance and Super

// Single Inheritance:-
// Use extends to derive a Subclass from one superClass. 

// Constructor Invacation:-
// Super(args...) calls a superClass Constructor, must be first in Subclass Constructor. 

// Method Overloading:-
// Subclass can override non-final methods of superClass, use @Override.

// Acessing Subclass Members:-
// super.method() or super.field bypass overridden definitions. 

// Snippet(AnimalDog.java)

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Some Sound");
    }
}

// Dog.java
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: woof!");
    }
}

// Main.java
//public using further when we have external file
class  Main{
    public static void main(String[] args) {
        Dog d = new Dog("Sheru");
        d.sound();
    }
}

 // Output:- Sheru says: woof!     
