// Problem Statement:- Convert an Array of integers to on ArrayList and print the result.
// Hint:- Use Arrays.asList() wrapped in a new Arraylist to create a dyamic list.

package main_java17;
import java.util.ArrayList;
import java.util.Arrays;
public class ProbState2 {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        ArrayList<Integer>numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("Converted ArrayList " + numList);
    }
}
//Output:- Converted ArrayList [1, 2, 3, 4, 5]