package main_java16;
import java.util.ArrayList;

// Problem Statements :- Create on ArrayList of integers and print each element using a traditional for loop.
// Hint :- Use Size() and get(i) for iteration.

public class ProbState5 {
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);
        number.add(100);
        for(int i=0; i<number.size(); i++){
            System.out.println(number.get(i) + "");
        }        
    }
}
// output :-
// 10
// 20
// 30
// 40
// 50
// 60
// 70
// 80
// 90
// 100
