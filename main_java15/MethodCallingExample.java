package main_java15;

public class MethodCallingExample {
    public int square(int x){
        return multiply(x,x);
    }
    private int multiply(int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
        MethodCallingExample example = new MethodCallingExample();
        System.out.println("Square of 5 : " + example.square(5));
    }
}
// output 
// Square of 5 : 25
// Note:- The square method calculates the square of a number by calling the helper method multiply.