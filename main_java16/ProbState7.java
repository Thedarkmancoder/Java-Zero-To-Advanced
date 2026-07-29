// Problem Statement:- Create an ArrayList of strings and check if it contains "Bob". 
// Hint:- Use contains() to verify if the list includes the given element.

import java.util.ArrayList;
public class ProbState7 {
    public static void main(String[] args){
     ArrayList<String>names = new ArrayList<>();
        names.add("Nitish");
        names.add("Chandan");
        names.add("Nilesh");
        names.add("Aniket");
        names.add("Bob");
        names.add("Kalu");
        names.add("Abhishek");
        names.add("Sanat");
        boolean Found = names.contains("Bob");
        System.out.println("Contains 'Bob' ? " + Found);   
    }
}
// output 
// Contains 'Bob' ? true