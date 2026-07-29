//package main_java16;
import java.util.ArrayList;

//Problem Statement:- Create an ArrayList of Intergers and remove the element of Index.
//Hint:- Use remove(index) to delete an elements the list will re-index automatically.

public class ProbState2 {
  public static void main(String[] args){
    ArrayList<Integer>numbers = new ArrayList<>();
    numbers.add(20);
    numbers.add(10);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    numbers.add(60);
    numbers.add(70);
    numbers.add(80);
    numbers.add(100);
    numbers.remove(8); // remove 100 numbers
    System.out.println(numbers);
  }  
}
// output :- [20, 10, 30, 40, 50, 60, 70, 80]