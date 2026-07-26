package main_java10;

public class SwitchInChar {
    public static void main(String[] args){
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println( " Excellent ");
                break;
            case 'B' :
                System.out.println("Good ");
                break;
            default :
                System.out.println("Needs Improvement ");
                break;
        }
    }
}
