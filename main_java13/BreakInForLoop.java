package main_java13;

public class BreakInForLoop {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
// output
// 0
// 1
// 2
// 3
// 4