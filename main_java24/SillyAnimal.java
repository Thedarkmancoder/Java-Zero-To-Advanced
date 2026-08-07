// Problem Statement:- Create a simple class animal with attributes and a method to display details.
// Hint:- Define instance variables and a method to print the objects data.

package main_java24;
public class SillyAnimal {
    // Instance variables
    String Type;
    int age;
    // method to display detaisl
    public  void displayInFo(){
        System.out.println("Type : " + Type );
        System.out.println("Age : " + age);
    }
    public static void main(String[] args) {
        //creating an object of SillyAnimal
        SillyAnimal a = new SillyAnimal();
        a.Type = "cat";
        a.age = 3;
        a.displayInFo();
    }
}
// output:-
// Type : cat
// Age : 3