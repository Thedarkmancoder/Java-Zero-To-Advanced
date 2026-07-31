// Problem Statement:- Sort an ArrayList of integers in ascending order using a lambda expression.
// Hint:- Replace the custom comparator with a concise lambda.

package main_java19;
import java.util.LinkedList;
import java.util.Collections;
public class ProbState4 {
    public static void main(String[] args) {
        //Advanced : Using Lambda for Sortng.
        LinkedList<Integer>numbers = new LinkedList<>();
        numbers.add(2343);
        numbers.add(3353);
        numbers.add(344);
        numbers.add(98789);
        numbers.add(78997);
        numbers.add(87567);
        numbers.add(8675);
        numbers.add(42525);
        numbers.add(2442);
        numbers.add(9787);
        Collections.sort(numbers , (a,b) -> a-b);
        System.out.println("Sorted Using Lambda : " + numbers);
    }
}
// output :- Sorted Using Lambda : [344, 2343, 2442, 3353, 8675, 9787, 42525, 78997, 87567, 98789]