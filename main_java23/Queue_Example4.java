// Problem Statement:- Check whether a queue of integers is empty and print an appropriate Message.
// Hint:- Use isEmpty() to determine if the queue is empty.

package main_java23;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example4 {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        System.out.println("Is Queue empty? " + queue.isEmpty());
        queue.add(10);
        System.out.println("Is Queue empty after adding an element? " + queue.isEmpty());
    }
}
// Output:-
// Is Queue empty? true
// Is Queue empty after adding an element? false