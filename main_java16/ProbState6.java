//package main_java16;

 // Problem Statement:-Create an arrayList of Strings and print each element using a for each loop.
 // Hint:- The Enhanced for loop simplifies traversal without using indices.

import java.util.ArrayList;
public class ProbState6{
public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
    names.add("Nitish");
    names.add("Amit");
    names.add("Chandan");
    names.add("Sahil");
    names.add("Nilesh ");
    names.add("Aniket");
    for(String name : names){
System.out.println(name);
    }
}
}
// output 
// Nitish
// Amit
// Chandan
// Sahil
// Nilesh 
// Aniket