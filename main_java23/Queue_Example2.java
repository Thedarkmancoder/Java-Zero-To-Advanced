// Problem Statement:- Remove the Front element from a queue of strings and print it along with the updated queue.
// Hint:- Use poll() to remove and return the front element.

package main_java23;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Example2 {
    public static void main(String[] args) {
        Queue<String>queue = new LinkedList<>();
        queue.add("Anjali kumari");
        queue.add("Nitish kumar");
        queue.add("jaiki kumar");
        queue.add("Chandan kumar");
        queue.add("Amit kumar");
        queue.add("Nilu kumar");
        System.out.println(" Before Remove Front Element : " + queue);
        queue.poll();
        System.out.println("After Remove the Element : " + queue);
    }
}
// Output:- 
// Before Remove Front Element : [Anjali kumari, Nitish kumar, jaiki kumar, Chandan kumar, Amit kumar, Nilu kumar]
// After Remove the Element : [Nitish kumar, jaiki kumar, Chandan kumar, Amit kumar, Nilu kumar]

