package main_java12;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i =1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                System.out.println(i * j + "");
            }
        }
    }
}
// output
// 1
// 2
// 3
// 2
// 4
// 6
// 3
// 6
// 9