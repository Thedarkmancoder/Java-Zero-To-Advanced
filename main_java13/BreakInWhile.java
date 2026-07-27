package main_java13;

public class BreakInWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            if(i==3)break;
            System.out.println(i);
            i++;
        }
    }
}
// output
// 0
// 1
// 2