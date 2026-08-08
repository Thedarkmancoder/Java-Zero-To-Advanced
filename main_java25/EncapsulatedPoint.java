//Encapsulation:-
// Encapsulation bundles data(fields) and the methods that data into a Single unit, restricting direct access to some components. 

// Advantages:-

// Data Integrity: Prevents invalid states. 

// Maintainability:- Internal representation can evolve without breaking clients. 

// Security:- Sensitive fields remain hidden. 

// Controlled Access:- validation, logging or side-effects can be placed in accessars. 

// java Mechanisms:-

// . marks fields private.

// . expose behaviar via public , protected or package-private methods. 

// . prefer composition over exposing mutable fields. 

public class EncapsulatedPoint {
    private int x; // hidden from outside
    private int y; // hidden from outside
    public EncapsulatedPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Controlled access
    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public static void main(String[] args) {
     EncapsulatedPoint p = new EncapsulatedPoint(2, 3);
        System.out.println("Point : (" + p.getX() + "," + p.getY() + ")");
    }
}

// Output:-Point : (2,3)