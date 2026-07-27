package main_java13;

public class ContinueInWhile {
    public static void main(String[] args) {
        int j = 0;
        while (j<5) {
            j++;
            if(j==3) continue;
            System.out.println(j);
        }
    }
}
// output 
// 1
// 2
// 4
// 5