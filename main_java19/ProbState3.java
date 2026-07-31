// Problem Statement:- Create an ArrayList of Integers and Sort it in Descending Order.
// Hint:- Use Collections.sort() with a custom comparator or Lambda expression.

package main_java19;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class ProbState3 {
    public static void main(String[] args) {
        //Moderate/Advanced: Descending Order.
        LinkedList<Integer>numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(34);
        numbers.add(78);
        numbers.add(12);
        numbers.add(98);
        numbers.add(45);
        numbers.add(66);
        numbers.add(89);
        // Collections.sort(numbers);// line 19 to 20 option 1 to solve the problem. // output:-[98, 89, 78, 66, 45, 34, 12, 3]
        // Collections.reverse(numbers);
        Collections.sort(numbers, new Comparator<Integer>() { // line 22 to 26  option 2 to solve the problem.
            public int compare(Integer a , Integer b){
                return b-a;
            }
        } );
        System.out.println("Sorted Descending : " +numbers);
    }
}
// Output:- Sorted Descending : [98, 89, 78, 66, 45, 34, 12, 3]
