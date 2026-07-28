package main_java16;
import java.util.ArrayList;

// Problem Statement:- Create an Arraylist of Characters and print the element at index 2.
// Hint:- Use get(index) to retrieve an element by its.

public class ProbState3 {
    public static void main(String[] args){
        ArrayList<Character>letters = new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        letters.add('F');
        letters.add('G');
        letters.add('H');
        System.out.println("Element at index 2 : " + letters.get(7)); // H
    }
}
// output Element at index 2 : H
