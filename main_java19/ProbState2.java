// Problem Statement:- Create an ArrayList of Strings and sort them alphabetically.
// Hint:- Use Collections.sort() an a list of Strings.

package main_java19;
import java.util.Collections;
import java.util.LinkedList;
public class ProbState2 {
    public static void main(String[] args) {
       // Moderate : Alphabetical order.
        LinkedList<String>names = new LinkedList<>();
        names.add("Nitish");
        names.add("Ajay");
        names.add("Chandan");
        names.add("Anil");
        names.add("Pradeep");
        names.add("Anjali");
        names.add("Anvi");
        Collections.sort(names);
        System.out.println("Alphabetically Sorted : " +names);

    }
}
// output:- Alphabetically Sorted : [Ajay, Anil, Anjali, Anvi, Chandan, Nitish, Pradeep]