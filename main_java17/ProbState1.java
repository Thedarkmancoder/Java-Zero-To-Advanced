// Advanced ArrayList Operations
//Problem Statement:- Insert "Bob"  into an ArrayList of names at index 1 and print the updated list.
//Hint:- use add(index,element) to insert without overwriting existing elements.

package main_java17;
import java.util.ArrayList;
public class ProbState1 {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<>();
        name.add("Nitish");
        name.add("Anjali");
        name.add("Aashi");
        name.add("Khushi");
        name.add(1 ,"Bob");// insert "Bob" at index 1
        System.out.println("After Insertion : " + name);
    }
}
// output :- After Insertion : [Nitish, Bob, Anjali, Aashi, Khushi]