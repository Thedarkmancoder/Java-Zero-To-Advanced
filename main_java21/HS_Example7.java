// Problem Statement:- Convert a HashSet of Strings to an array and print the array elements.
// Hint:- Use toArray() to convert the set to an array.

package main_java21;
import java.util.Arrays;
import java.util.HashSet;
public class HS_Example7 {
    public static void main(String[] args){
// Hint:- Convert the HashSet to an Array using toArray().
    HashSet<String>Fruits = new HashSet<>();
    Fruits.add("Banana");
    Fruits.add("Apple");
    Fruits.add("Cherry");
    Fruits.add("Grapes");
    Object[] FruitArray = Fruits.toArray();
    System.out.println(" Array : " + Arrays.toString(FruitArray));    
    }
}
//Output:-  Array : [Apple, Cherry, Grapes, Banana]
