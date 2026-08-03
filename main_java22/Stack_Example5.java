// Problem Statement:- Searching For an Element in a Stack and print its position From the top.
// Hint:- Use Search(item) which returns a 1-based position.

package main_java22;
import java.util.Stack;
public class Stack_Example5 {
    public static void main(String[] args){
        Stack<String>stack = new Stack<>();
        stack.push("Nitish");
        stack.push("Chandan");
        stack.push("Amit");
        stack.push("Suraj");
        stack.push("Deepak");
        int pas = stack.search("Amit");
        System.out.println(" Position of 'Second' From the top : " + pas);
    }
}
// Output :- Position of 'Second' From the top : 3