// Problem Statement:- Create a class vehicle that initializes its attributes using a constructor.
// Hint:- Defines a constructor that accepts parameters to initialize object properties.

package main_java24;

public class WackyVehicle {
    String brand;
    int year;
    // Constructor with parameters
    public WackyVehicle(String b , int y){
        this.brand= b;
        this.year = y;
}
public void showInFo(){
    System.out.println("Brand : " + brand + ", Year : " + year);
}
public static void main(String[] args) {
    WackyVehicle car = new WackyVehicle("Toyata", 2020);
    car.showInFo();
}
}
// Output:- Brand : Toyata, Year : 2020