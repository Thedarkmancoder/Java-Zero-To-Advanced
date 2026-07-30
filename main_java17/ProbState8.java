// Problem Statement:- Merge two ArrayList of Strings into one and print the resulting list.
// Hint:- Use addAll() to combine the elements of the second list into the first.

package main_java17;
import java.util.ArrayList;
public class ProbState8 {
    public static void main(String[] args){
        ArrayList<String>BoysName = new ArrayList<>();
        BoysName.add("Nitish");
        BoysName.add("Chandan");
        BoysName.add("Aakash");
        BoysName.add("Jaiki");
        BoysName.add("Sahil");
        ArrayList<String>GirlsName = new ArrayList<>();
        GirlsName.add("Anjali");
        GirlsName.add("Aashi");
        GirlsName.add("Anvi");
        GirlsName.add("Anvita");
        GirlsName.add("Divya");
        BoysName.addAll(GirlsName);
        System.out.println("Combined List " +BoysName);
    }
}

// output:- Combined List [Nitish, Chandan, Aakash, Jaiki, Sahil, Anjali, Aashi, Anvi, Anvita, Divya]