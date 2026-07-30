// Problem Statement:- Create a LinkedList of integers and insert elements at the begining and end.
// Hint:- Use addFirst() for the beginning and addLast for the end.

package main_java18;
import java.util.LinkedList;
public class ProbState2 {
    public static void main(String[] args){
        LinkedList<Integer>number = new LinkedList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);
        number.addFirst(110);
        number.addLast(130);
        System.out.println("Numbers : " + number);
    }
}
// output:- Numbers : [110, 10, 20, 30, 40, 50, 60, 70, 80, 90, 130]