// Problem Statement:- Create a HashSet of Integers and print the Set.
// Hint:- Use adD(element) to insert values, note that duplicates will be ignored.

package main_java21;
import java.util.HashSet;
public class HS_Example1 {
    public static void main(String[] args) {
//Hint:- Add elements using add() , dublicates are automatically. discarded.      
        HashSet<Integer>numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40); // dublicate, will not be added
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(10); //dublicates
        numbers.add(90);
        System.out.println(" HashSet : " + numbers);

    }
}
// Output:-  HashSet : [50, 20, 70, 40, 10, 90, 60, 30]
