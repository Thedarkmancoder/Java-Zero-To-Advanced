// Long To Int (data loss possiblity)
package main_java2;

public class LongToInt {
    public static void main(String[] args){
        long bigNum = 123456789l;
        int smallNum = (int) bigNum;
        System.out.println("After Casting : " + smallNum);
    }
}
// output After Casting : 123456789