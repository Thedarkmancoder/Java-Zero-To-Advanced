//Problem Statement:- List all Vowels in "Regular Expressions.!"
//Hint:- Use character class [AEIOUaeiou].
package main_java31;
import java.util.regex.*;
public class CharacterClassMatching {
    public static void main(String[] args){
    String s = "Regular Expressions!";
    //1. pattern for Vowels
    Pattern p = Pattern.compile("[AEIOUaeiou]");
    Matcher m = p.matcher(s);
    //2. Find() each vowel
    while(m.find()){
        //3. print the matched character
        System.out.println(m.group());
    }
}
}
// Output:-
// e
// u
// a
// E
// e
// i
// o
// Explanation:-
// [AEIOUaeiou] matches any uppercase or lowerCase Vowel.
// Loop find() to locate each vowel.
// group() outputs matched letter.
