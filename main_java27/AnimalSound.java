// Topic:- PolyMorphism & super interaction
//  Normal Dispatch:-
//  obj.method():- most specific override at runtime.

// Inside Override:- 
//  super.method():- immediate parents version, regardless of deeper overrides.

// Code Binding:- Determined at compile time for super calls. 

// Example Flows:-
// class A{
// void F(){
//     print("A");
// }
// }
// class B extends A {
//     @override void F(){
//         print("B");
//     }
// }
// class C extends B {
// @override void F(){
//     super.F();
//     print("C");
// }
// }
// A x = new C();
// x.F();

// Use code :- Gurantee that an intermediate class 'logic runs before subclass'

//Problem Statement:- Implement Animal.speak(). subclasses dog and cat override speak(). in main, store
//                    them in an array of animal and call speak() on each.

// Hint:- Use @Override in Dog/Cat and a single main inside example1.

package main_java27;

public class AnimalSound {
    static class Animal{
        void speak(){
            System.out.println("Some Sound");
        }
    }
    static class Dog extends Animal{
        @Override void speak(){
            System.out.println("Woof");
        }
    }
    static class Cat extends Animal{
        @Override void speak(){
            System.out.println("Meow");
        }
    }
    public static void main(String[] args){
        Animal[] zoo = { new Animal(), new Dog(), new Cat()
        };
        for(Animal a : zoo) a.speak();
    }    
}
// Output:-
// Some Sound
// Woof
// Meow