//Problem Statement:- Abstract class shape with double area(). implement circle and rectangle then print their areas formatted to two decimals.
// Hint:- override area() use a single main in example2
package main_java27;

public class Example2 {
    static abstract class Shape {
        abstract double area();
    }
    static class Circle extends Shape{
        double r;
        Circle(double r){
            this.r = r;
        }
        @Override double area(){
            return Math.PI*r*r;
        }
    }
    static class Rectangle extends Shape {
        double w,h;
        Rectangle(double w, double h){
            this.w = w;
            this.h = h;
        }
        @Override double area(){
            return w*h;
        }
    }
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(3, 4)};
        for(Shape s : shapes){
            System.out.printf("%,2f%n" , s.area());
        }
    }
}
// Output
// 12.566371
// 12.000000