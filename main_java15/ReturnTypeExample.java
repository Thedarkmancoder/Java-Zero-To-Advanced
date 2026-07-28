package main_java15;

public class ReturnTypeExample {
    public int add(int a, int b){
        return a+b;
    }
public static void main(String[] args){
    ReturnTypeExample example = new ReturnTypeExample();
    System.out.println("Sum of 3 and 4 : " + example.add(3,4));
}
}
// output 
// Sum of 3 and 4 : 7
// Note:- The Method add takes two integers and return their sum.