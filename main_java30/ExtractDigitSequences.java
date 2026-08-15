//Problem Statement:- From "A1B22C333", print each group of digits separately : 1
//                                                                              22
//                                                                              333
//Hint:= Use \d+ and loop with find()+group().

package main_java30;
import java.util.regex.*;
public class ExtractDigitSequences {
    public static void main(String[] args) {
        String s = "A1B22C333";
        //1. pattern for one-or-more digits.
        Pattern p = Pattern.compile("\\d+");
        //2. Create matcher
        Matcher m = p.matcher(s);
        //3. Loop Find() to locate each digit sequence
          while (m.find()){
            //4. m.group() returns the matching substring
            System.out.println(m.group());
          }
    }   
}
// Output:-
// 1
// 22
// 333

// Explanation:-
// compile \d+
// m.find() locates first match "!".
// m.group() returns "1".
// Loop repeats for "22" , "333".
