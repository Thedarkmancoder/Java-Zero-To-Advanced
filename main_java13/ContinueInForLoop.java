package main_java13;

public class ContinueInForLoop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}
// output
// 0
// 1
// 3
// 4