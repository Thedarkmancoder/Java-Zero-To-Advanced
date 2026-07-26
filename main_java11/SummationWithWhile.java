package main_java11;

public class SummationWithWhile {
    public static void main(String[] args){
        int sum = 0; 
        int k = 3;
        while(k<=10){
            sum = sum +k;
            k++;
        }
        System.out.println("Sum : " + sum);
    }   
}
// output sum : 52