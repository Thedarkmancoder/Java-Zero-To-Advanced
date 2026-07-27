package main_java13;

public class NestedLoopWithBreak {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                if(j==1) break;
                System.out.println(" i = " + i + ", J = " + j);
            }
        }
    }   
}
// output 
//  i = 0, J = 0
//  i = 1, J = 0
//  i = 2, J = 0