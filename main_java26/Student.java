// Topic :- Getters and Setters
//  purpose:- provide Controlled field access and mutation.

//  Getter(Accessor):-
//  Signature:- public type getFieldName()
//  can include casching , lazy initialization or logging.

//  Setter(mutator):-
//  Signature:- public void setFieldName(Type value)
// . can enforce validation , trigger notication or maintain invariants.

// JavaBeans Conventions:-
// . Field foo -> getfoo(), setfoo(...).
// . Boolean field -> isfoo(), setfoo(...).

// Advanced Uses:-
// . Immutable objects:- Omit Setters.
// . Fluent Interfaces:- Setters return this. 
// . Computed properties:- Getter computer value on demand.

// Topic :- Example Constructor Overloading & Chaining.

//  Problem Statement:- Implement student with three Constructors :
// . No-arg -> defaults
// . One-arg(name)
// . Two-arg(name, age)
// Hint:- use this(...) to chain from simpler to more detailed Constructors.


package main_java26;

public class Student {
    String name; 
    int age;
    public Student(){
        this("Unknown", 0);
    }
    public Student(String name){
        this(name,0);
    }
    public Student(String name , int age ){
        this.name = name;
        this.age = age;
        System.out.println(name + " is " + age + " year old. ");
    }
    public static void main(String[] args) {
        new Student();
        new Student("Nitish ");
        new Student("Jaiki " , 22);
    }
    
}
// Output:-
// Unknown is 0 year old.
// Nitish  is 0 year old.
// Jaiki  is 22 year old. 