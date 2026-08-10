// Problem Statement:- Create class person with private name, public getter/setter. in main, set amd print name.

package main_java26;

public class person {
    private String name;
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        person p = new person();
        p.SetName(" Nitish ");
        System.out.println("Name : " + p.getName());
    }
}
// Output:-
// Name :  Nitish 