package main_java15;

public class StaticVsInstanceExp {
    public static int multiply(int a , int b){
        return a*b;
    }
    public static int subtract(int a , int b){
        return a-b;
    }
    public static void main(String[] args){
        System.out.println("Static Multiply(4*5): " + multiply(4, 5));
        // Call Static Method Directly
        StaticVsInstanceExp obj = new StaticVsInstanceExp();
        System.out.println("Instance sebtract(10-3) : " + obj.subtract(10, 3));
    }
}
// output 
// Static Multiply(4*5): 20
// Instance sebtract(10-3) : 7
// note:- Demonstrates a static method(multiply) that can be called without an object and an Instance
// method(subtract) that requres one.