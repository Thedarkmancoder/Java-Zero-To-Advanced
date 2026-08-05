// Problem Statement:- Retrieve the front element of a queue of characters without removing it.
// Hint:- Use Peek() to view the front element.

package main_java23;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example3 {
    public static void main(String[] args) {
    Queue<Character>queue = new LinkedList<>();
    queue.add('A');
    queue.add('B');
    queue.add('C');
    queue.add('D');
    queue.add('E');
    System.out.println("Front Element : " + queue.peek());
    System.out.println(" Queue Remains : " + queue);
    }
}
// Output:- 
// Front Element : A
//  Queue Remains : [A, B, C, D, E]
