//Problem Statement:- Reverse the order of elements in an ArrayList of Strings and print the reversed list.
//Hint:- Use Collections.reverse() to reverse the other.

package main_java17;
import java.util.ArrayList;
import java.util.Collections;
public class ProbState4 {
   public static void main(String[] args) {
    ArrayList<String>words = new ArrayList<>();
    words.add("one");
    words.add("Two");
    words.add("Three");
    words.add("Four");
    words.add("Five");
    words.add("Six");
    words.add("Seven");
    words.add("Eight");
    words.add("Nine");
    words.add("Ten");
    Collections.reverse(words);
    System.out.println("Reversed List : " + words);
   } 
}

// output:- Reversed List : [Ten, Nine, Eight, Seven, Six, Five, Four, Three, Two, one]