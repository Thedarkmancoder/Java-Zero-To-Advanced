// Problem Statement:- check if a HashSet of strings contains the element "apple".
// Hint:- Use contains(element) to check membership.

package main_java21;
import java.util.HashSet;
public class HS_Example2 {
    public static void main(String[] args) {
// Hint:- Use contains() to verify the existence of an element.
    HashSet<String>Fruits = new HashSet<>();
    Fruits.add("Apple");
    Fruits.add("Banana");
    Fruits.add("Cherry");
    boolean hasApple = Fruits.contains("Apple");
    System.out.println("Contains 'apple'? : " + hasApple);        
    }
}
// output:- Contains 'apple'? : true