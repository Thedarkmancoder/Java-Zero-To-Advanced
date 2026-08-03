// Problem Statement:- Create a Stack of Integers and push several elements onto it.
// Hint:- Use push(item) to add elements.

package main_java22;
import java.util.Stack;
public class Stack_Example1 {
    public static void main(String[] args) {
        Stack<Integer>Stack = new Stack<>();
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(45);
        Stack.push(50);
        System.out.println("Stack : " + Stack);
    }
}
// Output:- Stack : [10, 20, 30, 45, 50]