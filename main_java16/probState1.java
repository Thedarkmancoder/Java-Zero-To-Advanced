//package main_java16;
import java.util.ArrayList;

//Hint:- add() to insert each fruit.
//Problem Statement:- Create an ArrayList of fruit names and print the list.

public class probState1 {
    public static void main(String[] arsg){
        ArrayList<String>Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("cherry");
        Fruits.add("Date");
        Fruits.add("Elderberry");
        Fruits.add("Fig");
        Fruits.add("Grape");
        Fruits.add("Honeydew");
        System.out.println("FruitList : " + Fruits);

    }
}
// output FruitList : [Apple, Banana, cherry, Date, Elderberry, Fig, Grape, Honeydew]