// Problem Statement:- Given an ArrayList with duplicate values, use a HashSet to eliminate duplicates and print the result.
// Hint:- Create a HashSet from the ArrayList and then (optionally) convert back to an ArrayList.

package main_java21;
import java.util.HashSet;
import java.util.ArrayList;
public class HS_Example8 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(13);
        number.add(23);
        number.add(97);
        number.add(66);
        number.add(86);
        number.add(87);
        number.add(13); // dublicate value
        number.add(79);
        System.out.println("Before using HashSet : " + number);
        HashSet<Integer>uniqueSet = new HashSet<>(number);
        System.out.println("Unique elements : " + uniqueSet);
    }
}
// Output:-
// Before using HashSet : [13, 23, 97, 66, 86, 87, 13, 79]
// Unique elements : [97, 66, 86, 23, 87, 13, 79]
