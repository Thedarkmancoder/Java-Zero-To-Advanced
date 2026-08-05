// Problem Statement:- Create a Queue of integers using LinkedList and add several elements.
// Hint:- Use offer() or add() to insert element.

package main_java23;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Example1 {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        System.out.println("Final Queue : " + queue);
    }
}
// Output :- Final Queue : [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]