// Problem Statement:- Push a Sequence of integers onto a Stack and then pop all elements to print them.
// Hint:- Use a loop to pop elements until the stack is empty.

package main_java22;
import java.util.Stack;
public class Stack_Example7 {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    stack.push(10);
    System.out.println("Popped Elements : " + stack);
    while(!stack.empty()){
        System.out.println(stack.pop() + "");
    }
    }   
}
// Output:-
// Popped Elements : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1