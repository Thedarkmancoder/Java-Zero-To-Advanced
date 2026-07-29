// Problem Statement:- Create an ArrayList of Strings , add several color Colors and print the list size.
// Hint:- Use the size() method to get the number of elements.

import java.util.ArrayList;
public class ProbState8{
    public static void main(String[] args){
        ArrayList<String>Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Green");
        Colors.add("Blue");
        Colors.add("Indigo");
        Colors.add("Yellow");
        Colors.add("Purple");
        Colors.add("Orange");
        Colors.add("Pink");
        Colors.add("Brown");
        Colors.add("Black");
        System.out.println("List Size : " +Colors.size());
    }
}
// output 
// List Size : 10