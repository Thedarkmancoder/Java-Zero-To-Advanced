// Theory- this keyword 

// Field Disambliguation :-
// this.field = Parameter, distinguishes instance variables from Parameters. 

// Constructor chaining:-
// this(args..) invokes another Constructor in same class must be first statement.

// Passing Current Object:-
// Methods can accept this(someMethod(this)).

// Fluent APIs:-
// Raturn this to enable chaining of setters. 

// Sinppet(Student.java)

public class Student {
    private String name;
    // Parameterized Constructor
    public Student(String name){
        this.name = name;
    }
    // No-arg constructor calls the parameterized one.
    public Student(){
        this("Unknown");
    }
    public void printName(){
        System.out.println("Name : " + this.name);
    }
    public static void main(String[] args) {
       new Student().printName();
       new Student("Nitish").printName();
    }
}
// Output:-
// Name : Unknown
// Name : Nitish