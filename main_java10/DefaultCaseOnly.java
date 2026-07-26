package main_java10;

public class DefaultCaseOnly {
    public static void main(String[] args){
        int number = 99;
        switch (number) {
            default:
                System.out.println("No Matching Case ");
                break;
        }
    }
}
// output : No Matching Case