//Problem Statement:- check whether " java" appears as a whole word in s.
//Hint:- Use \bjava\b.

package main_java31;
import java.util.regex.*;
public class WordBoundaryDetection {
    public static void main(String[] args) {
        String s = "I love java Programming ";
        //1. pattern with word-boundary anchors
        Pattern p = Pattern.compile("\\bjava\\b");
        //2. Find() returns true if standalone "java" exists.
        boolean Found = p.matcher(s).find();
        System.out.println(Found);
    }
}
//  Output:- true 
//  Explanation:-
//  . \b ensures match starts/ends at word boundary.
//  . "Java" must be isolated from other letters.
//  . Find() returns true for input.
