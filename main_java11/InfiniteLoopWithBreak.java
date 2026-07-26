package main_java11;

public class InfiniteLoopWithBreak {
    public static void main(String[] args){
        int count = 0;
        while(true){
            if(count == 9) break;
            System.out.println("Count : " + count);
            count++;
        }
    }
}
// output 
// Count : 1
// Count : 2
// Count : 3
// Count : 4
// Count : 5
// Count : 6
// Count : 7
// Count : 8