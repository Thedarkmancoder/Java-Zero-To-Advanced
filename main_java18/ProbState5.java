// Problem Statement:- Iterate over a LinkedList of weekdays and print each day using a for-each loop.
// Hint:- The Enhanced For Loop is Ideal For Iterating Over Collections Without Index Management.

package main_java18;
import java.util.LinkedList;
public class ProbState5 {
    public static void main(String[] args){
        //Advanced: iterate through the list
        LinkedList<String>Days = new LinkedList<>();
        Days.add("Monday");
        Days.add("Tuesday");
        Days.add("Wednesday");
        Days.add("Thrusday");
        Days.add("Friday");
        Days.add("Saturday");
        for(String Day : Days){
            System.out.println(Day);
        }
    }
}
// output:-
// Monday
// Tuesday
// Wednesday
// Thrusday
// Friday
// Saturday