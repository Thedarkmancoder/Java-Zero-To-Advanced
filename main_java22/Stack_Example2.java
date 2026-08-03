// Problem Statement:- Pop the top element from a stack of strings and print the element along with the updated stack.
// Hint:- Use pop() to remove the top element.

package main_java22;
import java.util.Stack;
public class Stack_Example2 {
    public static void main(String[] args) {
        Stack<String>Stack = new Stack<>();
        Stack.push("A");
        Stack.push("B");
        Stack.push("C");
        Stack.push("D");
        String top = Stack.pop();
        System.out.println("Popped Element : " + top);
        System.out.println("Updated Stack : " + Stack);
    }
}
// Output:- 
// Popped Element : D
// Updated Stack : [A, B, C]