// Problem Statement:- Create a Linkedlist of characters, retrieve the first and last elements then update the first element.
//Hint:- Use getFirst() , getLast() and set(index, element).

package main_java18;
import java.util.LinkedList;
public class ProbState3 {
    public static void main(String[] args){
//moderate/Advanced:- Access and Update elements.
        LinkedList<Character>letter = new LinkedList<>();
        letter.add('A');
        letter.add('B');
        letter.add('C');
        letter.add('D');
        letter.add('F');
        letter.add('G');
        letter.add('H');
        System.out.println("First : " + letter.getFirst());
        System.out.println("Last : " + letter.getLast());
        System.out.println("After Update : " + letter);
    }
}
// output:-
//  First : A
// Last : H
// After Update : [A, B, C, D, F, G, H]