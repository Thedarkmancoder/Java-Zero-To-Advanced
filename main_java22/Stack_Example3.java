// Problem Statement:- Retrieve(Without removing) the top element of a Stack of Characters.
// Hint:- Use peek() to view the top elements.

package main_java22;
import java.util.Stack;
public class Stack_Example3 {
    public static void main(String[] args) {
        Stack<Character>Stack = new Stack<>();
        Stack.push('A');
        Stack.push('B');
        Stack.push('C');
        Stack.push('D');
        Stack.push('E');
        System.out.println("Top Element : " + Stack.peek());
        System.out.println("Stack Remains : " + Stack);
    }
}

// Output:-
// Top Element : E
// Stack Remains : [A, B, C, D, E]