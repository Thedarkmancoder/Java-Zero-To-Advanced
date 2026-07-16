package main_java1;

public class formatedOutput {
    public static void main(String[] args){
        double price = 99.9;
        System.out.printf(" Price : $%.2f\n " , price);
    }
}

// output if write $%.2f\n = 99.90 and when write $%2f\n = 99/90000000