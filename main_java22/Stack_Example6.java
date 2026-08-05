// Problem Statement:- Iterate over a Stack of strings using a for-each loop and print each element.
// Hint:- Use the enhanced for loop to iterate without madifying the stack.

package main_java22;
import java.util.Stack;
public class Stack_Example6 {
    public static void main(String[] args){
        Stack<String>stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        for(String Stacks : stack){
            System.out.println("Stacks : " + Stacks);
        }
    }
}
// Output:-
// Stacks : One
// Stacks : Two
// Stacks : Three
// Stacks : Four
