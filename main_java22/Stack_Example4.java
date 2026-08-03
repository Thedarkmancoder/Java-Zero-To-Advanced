// Problem Statement:- Check if a Stack of integers is empty and print an propriate message.
// Hint:- Use empty() to check the Stack.

package main_java22;
import java.util.Stack;
public class Stack_Example4 {
    public static void main(String[] args) {
        Stack<Integer>Stack = new Stack<>();
        System.out.println("Is Stack empty? " + Stack);
        Stack.push(24);
        Stack.push(34);
        Stack.push(97);
        Stack.push(99);
        System.out.println("Stack empty after push? " + Stack.empty());
    }
}
// OutPut :-
// Is Stack empty? []
// Stack empty after push? false