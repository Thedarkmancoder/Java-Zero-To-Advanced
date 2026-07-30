// Problem Statement:- Extract a Sublist From an ArrayList of Integers(From index 1 to 4) and print it.
// Hint:- Use SubList(FromIndex, toIndex) where toIndex id exclusive.

package main_java17;
import java.util.ArrayList;
import java.util.List;
public class ProbState7 {
    public static void main(String[] args){
        ArrayList<Integer>number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);
        number.add(100);
    List<Integer>sublist = number.subList(1, 9);//1,2,3,4,5,6,7,8
        System.out.println("SubList : " + sublist);
    }    
}
// Output:- SubList : [20, 30, 40, 50, 60, 70, 80, 90]