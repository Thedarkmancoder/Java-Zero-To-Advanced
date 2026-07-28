package main_java16;
import java.util.ArrayList;

// Problem Statement:- Create an ArrayList of Integers, Update the element at index 0 and print the updated list.
// Hint:- Use Set(index, element) to modify an element's value.

public class ProbState4 {
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
        number.set(0, 120);// before use it the output is [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        System.out.println("Updated List : " + number);
    }
}
// output :- [120, 20, 30, 40, 50, 60, 70, 80, 90, 100]