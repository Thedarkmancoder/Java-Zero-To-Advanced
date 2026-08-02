// Problem Statement:- Print the number of elements in a HashSet.
// Hint:- Use size() to get the count.

package main_java21;
import java.util.HashSet;
public class HS_Example5 {
    public static void main(String[] args) {
//Hint:- Use size() to get the number of elements.
    HashSet<String>animals = new HashSet<>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Birds");
    animals.add("Lion");
    System.out.println("Size : " + animals.size());
    }
}
// Output:- Size : 4