// Problem Statement:- Clear all elements From a  HashSet and print its size.
// Hint:- Use color() to remove all elements, then check size with size().

package main_java21;
import java.util.HashSet;
public class HS_Example6 {
    public static void main(String[] args) {
//Hint:- clear() empties the Set , size() should return 0.
    HashSet<Integer>number = new HashSet<>();
    number.add(234);
    number.add(3435);
    number.add(98);
    number.add(868);
    number.add(68);
    number.add(98686);
    number.add(224);
    number.add(23);
    System.out.println("Befor Clear : " + number);
    number.clear();
    System.out.println("After Clear : " + number);
    }
}
// output:-
//Befor Clear : [224, 98, 868, 68, 23, 234, 3435, 98686]
// After Clear : []
