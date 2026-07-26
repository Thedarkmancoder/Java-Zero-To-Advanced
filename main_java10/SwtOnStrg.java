package main_java10;

public class SwtOnStrg {
    public static void main(String[] args){
        String color = "red"; 
        switch (color) {
            case "red":
                System.out.println("Stop ");
                break;
            case "green":
                System.out.println("Go ");
                break;
            default:
                System.out.println("Caution ");
                break;
        }
    }
}
