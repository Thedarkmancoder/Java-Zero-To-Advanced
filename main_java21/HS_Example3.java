// Poblem Statement:- Remove a Specific element From a HashSet of Integers and print the updated Set.
// Hint:- Use remove(element) to delete the element.

package main_java21;
import java.util.HashSet;
public class HS_Example3 {
    public static void main(String[] args) {
// Hint:- Remove an element using remove().
    HashSet<Integer>numbers = new HashSet<>();
        numbers.add(13);
        numbers.add(23);
        numbers.add(44);
        numbers.add(35);
        numbers.add(989);
        numbers.add(68);
        numbers.add(90);
        numbers.add(67);
        numbers.add(97);
        System.out.println("Before removal : " + numbers);
        numbers.remove(35);
        System.out.println("After removal : " + numbers);

    }
}
// output :-
// Before removal : [97, 35, 67, 68, 23, 90, 44, 13, 989]
// After removal : [97, 67, 68, 23, 90, 44, 13, 989]