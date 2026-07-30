// Problem Statement:- Remove the First and Last Elements From a LinkedList of Strings and Print the Updated List.
// Hint:- Use removeFirst() and removeLast() to remove items From the Beginning and End.

package main_java18;
import java.util.LinkedList;
public class ProbState4 {
    public static void main(String[] args){
        //advanced: Remove elemets from both ends.
        LinkedList<String>items = new LinkedList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        items.add("Five");
        items.add("Six");
        items.add("Seven");
        items.add("Nine");
        items.add("Ten");
        items.removeFirst();
        items.removeLast();
        System.out.println("After Removals : " + items);
    }
}
// output:- After Removals : [Two, Three, Four, Five, Six, Seven, Nine]