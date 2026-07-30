// Problem Statement:- Find and print the index of "Tokya" in an ArrayList of city names.
// Hint:- Use Indexof(element) to obtain the index of the first occurence.

package main_java17;
import java.util.ArrayList;
public class ProbState5 {
    public static void main(String[] args){
        ArrayList<String>city = new ArrayList<>();
        city.add("Siwan");
        city.add("Chappra");
        city.add("Patna");
        city.add("Durg");
        city.add("Bhilai");
        city.add("Gopalganj");
        city.add("Maharajganj");
        city.add("Tokyo");
        //int index = city.indexOf("Tokyo");
       // System.out.println("Index of Tokyo : " + index);

       System.out.println("Index of Tokyo : " + city.indexOf("Tokyo"));
    }
}
// output :- Index of Tokyo : 7