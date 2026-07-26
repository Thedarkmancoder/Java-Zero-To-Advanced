package main_java11;

public class UserSumulation {
    public static void main(String[] args){
        int attemps = 0;
        boolean isloggedIn = false;
        while(!isloggedIn && attemps <3){
            // assume we check more condition
            attemps++;
        }
        System.out.println(" Login Attempts : " + attemps);
    }
}
// output Login Attempts : 3