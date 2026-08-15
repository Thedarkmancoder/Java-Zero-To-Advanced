//Problem Statement:- Verify that string s consists only of letters , digits or underscore.
//Hint:- Use ^\w+$, where \w = [A-Za-z0-9_].

package main_java30;
import java.util.regex.*;
public class AlphaNumericCheck {
    public static void main(String[] args) {
        String s = "User_123";
        //1. pattern for word characters only.
        Pattern p = Pattern.compile("^\\w+$");
        //2. match against input.
        boolean ok = p.matcher(s).matches();
        System.out.println(ok);
    }   
}
// Output:- true
// Explanation:-
// . \wt matches one or more word characters.
// . anchors force full-string match.
// . matches() -> true for "User_123".