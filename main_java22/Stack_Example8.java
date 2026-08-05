// Problem Statement:- Create a Stack of strings , push several elements and then print the final stack.
// Hint:- Use a generic stack and push multiple strings.

package main_java22;
import java.util.Stack;
public class Stack_Example8 {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();
        stack.push("Apple");
        stack.push("Cherry");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Date");
        stack.push("ElderBerry");
        System.out.println("Final Stack : "  + stack);
    }
}
// Output:- Final Stack : [Apple, Cherry, Banana, Orange, Date, ElderBerry]