// Problem Statement:-  Create an ArrayList of Integers and sort it in ascending order.
// Hint:- Use Collections.sort() for natural ordering.

package main_java19;
import java.util.ArrayList;
import java.util.Collections;
public class ProbState1 {
    public static void main(String[] args) {
        // Easy : Natural ascending order.
        ArrayList<Integer>num = new ArrayList<>();
        num.add(10);
        num.add(59);
        num.add(34);
        num.add(23);
        num.add(89);
        num.add(32);
        num.add(48);
        num.add(90);
        num.add(77);
        Collections.sort(num);
        System.out.println("Sorting Ascending : " + num);
    }
}
// output:- Sorting Ascending : [10, 23, 32, 34, 48, 59, 77, 89, 90]