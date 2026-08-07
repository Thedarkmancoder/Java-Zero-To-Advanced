// Problem Statement:-Create a class Counter that tracks the number of instances created.
// Hint:- Use a static Variable to count objects.

package main_java24;

public class LoonyCounter {
    // Static variable to count objects
    private static int count = 0;
    // Instance Variable
    private String id;
    // Constructor increments count and set id 
    public LoonyCounter(String id){
        this.id = id;
        count++;
        System.out.println("Object" + id + "created.");
    }
    public static int getCount(){
        return count;
    } 
    public void showInfo(){
        System.out.println("Object ID : " + id);
    }

public static void main(String[] args){
    LoonyCounter a = new LoonyCounter("A1");
    LoonyCounter b = new LoonyCounter("B1");
    a.showInfo();
    b.showInfo();
    System.out.println("Total Objects : " + LoonyCounter.getCount());
}
}
// Output:-
// ObjectA1created.
// ObjectB1created.
// Object ID : A1
// Object ID : B1
// Total Objects : 2