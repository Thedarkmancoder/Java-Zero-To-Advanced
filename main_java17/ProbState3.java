//Problem Statement:- Sort an ArrayList of integers in ascending order and print the sorted list.
//Hint:- Use Collections.sort() to sort the Arraylist naturally.

package main_java17;
import java.util.ArrayList;
import java.util.Collections;
public class ProbState3 {
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<>();
        number.add(10);
        number.add(80);
        number.add(10);
        number.add(60);
        number.add(50);
        number.add(30);
        number.add(90);
        number.add(20);
        number.add(40);
        Collections.sort(number);
        System.out.println("Sorted List : " + number);
    }
}
// output:- Sorted List : [10, 10, 20, 30, 40, 50, 60, 80, 90]