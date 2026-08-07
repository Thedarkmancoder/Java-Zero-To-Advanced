// Problem Statement:- Create a class Calculator with methods for addition and substraction then create objects and use them.
// Hint:- Define instance methods and call them on objects.

package main_java24;

public class SillyCalculator {
    public int add(int a , int b){
        return a+b;
    }
    public int subtract(int a , int b){
        return a-b;
    }
    public static void main(String[] args) {
        SillyCalculator calc = new SillyCalculator();
        System.out.println("Addition : " + calc.add(10,5 ));
        System.out.println("Subtraction : " + calc.subtract(45, 10));
    }
}
// Output:-
// Addition : 15
// Subtraction : 35