// Problem Statememt:- Iterate over a HashSet of strings and print each element.
// Hint:- Use a for-each loop to iterate over the set.

package main_java21;
import java.util.HashSet;
public class HS_Example4 {
    public static void main(String[] args) {
//Hint:- Use a for-each loop to iterate through the HashSet.
        HashSet<String>colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        for(String Color : colors){
            System.out.println(Color);
        }
    }
}
// output:-
// Red
// Blue
// Yellow
// Orange
// Green