// Problem Statement:- Create a class student with private attributes and provide public getters and setters.
// Hint:- Use Private variables and define public methods to access and modify them.

package main_java24;

public class CrazyStudent {
    // Private attributes for encapsulation
    private String name;
    private int marks;
    //Constructor
    public CrazyStudent(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    //Getter and setter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Getter and Setter for marks
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public void display(){
        System.out.println("Student : " + name + ", Marks : " + marks);
    }
    public static void main(String[] args){
        CrazyStudent s = new CrazyStudent("John", 85);
        s.display();
        s.setMarks(90);
        s.display();
    }
}

// Output:-
// Student : John, Marks : 85
// Student : John, Marks : 90