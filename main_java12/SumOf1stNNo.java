package main_java12;

public class SumOf1stNNo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<5;i++){
            sum+=i;
        }
        System.out.println("Sum : " +sum);
    }
}
// output Sum : 10