// Problem Statement:- Iterate over a StudentName of strings and print each element.
// Hint:- Use a For-Each loop to iterate over the StudentName.

package main_java23;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example5 {
    public static void main(String[] args){
        Queue<String>StudentName = new LinkedList<>();
        StudentName.offer("Nitish");
        StudentName.offer("Anjali");
        StudentName.offer("Aashi");
        StudentName.offer("Anvi");
        StudentName.offer("Jaiki");
        StudentName.offer("Chandan");
        StudentName.offer("Nilu");
        for(String Student : StudentName){
        System.out.println(" Student Name : " + Student);
    }
}
}

// Output:-
//  Student Name : Nitish
//  Student Name : Anjali
//  Student Name : Aashi
//  Student Name : Anvi
//  Student Name : Jaiki
//  Student Name : Chandan
//  Student Name : Nilu