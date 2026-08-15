//Problem Statement:- Match either "Color" or "Colour", but not "Colr".
//Hint:- Use Colou?r where u? is optional.

package main_java31;
import java.util.regex.*;
public class OpticalCharacter {
    public static void main(String[] args) {
        String[] tests = {"color", "colour", "colr"}; 
        Pattern p = Pattern.compile("colou?r");
        // u?means 'u' zero or one time
        for(String s : tests){
            //matches() checks full string
            System.out.printf(" %s -> %b %n",s,p.matcher(s).matches());
        }
    }
}
// Output:-
// color -> true 
//  colour -> true 
//  colr -> false 

//  Explanation:-
//  u? matches zero or one 'v'.
//  matches() checks full equality.
//  Outputs true for "color", "colour", false for "colr".