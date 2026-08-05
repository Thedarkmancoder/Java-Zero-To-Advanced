// Problem Statement:- Enqueue several elements in a Queue and then dequeue them one by one, printing each.
// Hint:- Use a Loop with poll() until the queue id empty.

package main_java23;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_Example6 {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Dequeue : " + element);
        }
    }
}

// Output:-
// Dequeue : 10
// Dequeue : 20
// Dequeue : 30
// Dequeue : 40
// Dequeue : 50