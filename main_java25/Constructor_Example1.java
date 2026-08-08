// /Constructor:-
// special method named after the class , no return type.

// Default Constructor:-
// Supplied bt compiler if name declared, initializes fields to java default(0,false,null).

// Parameterized Constructor:-
// Accepts arguments to set up object state at creation, enables carly validation.

// Copy Constructor(custom):-
// takes another instance of same type to clone its state.

// Snipped(Constructor_Example1):-
public class Constructor_Example1{
    int x, y;
    // Default Construtor
    public Constructor_Example1(){
        this.x = 0;
        this.y = 0;
    }
    // Parameterized Constructor
    public Constructor_Example1(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public static void main(String[] args){
        Constructor_Example1 A = new Constructor_Example1();
        Constructor_Example1 B = new Constructor_Example1(3,4);
        System.out.println("A : " + A);
        System.out.println("B : " + B);
    }
}
// Output:-
// A : (0,0)
// B : (3,4)