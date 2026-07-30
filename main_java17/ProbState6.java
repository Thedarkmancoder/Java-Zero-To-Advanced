// Problem Statement:- Clear all elements from an ArrayList and print the empty list.
// Hint:- Use the clear() method to remove all elements.

package main_java17;
import java.util.ArrayList;
public class ProbState6 {
    public static void main(String[] args){
        ArrayList<String>Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("Blue");
        Colors.add("Indigo");
        Colors.add("Blue");
        Colors.add("Black");
        Colors.add("Orange");
        Colors.add("Purple");
        Colors.add("Yellow");
        Colors.add("White");
        Colors.add("Green");
        //System.out.println("Print all list : " + Colors); // output:- Print all list : [Red, Blue, Indigo, Blue, Black, Orange, Purple, Yellow, White, Green]
        Colors.clear();
        System.out.println("ClearList :" + Colors);
    }
}
// output:- ClearList :[]