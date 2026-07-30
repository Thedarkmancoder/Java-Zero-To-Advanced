// Problem Statements:- Create a LinkedList of names and print the List.
// Hint:- Use the Simple add() method to append elements.

package main_java18;
import java.util.LinkedList;
public class ProbState1 {
    public static void main(String[] args){
        // Easy: create and add elements.
        LinkedList<String>names = new LinkedList<>();
        names.add("Nitish");
        names.add("Chandan");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names : " + names);
    }
}
// output:- Names : [Nitish, Chandan, Alice, Bob, Charlie]