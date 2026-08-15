// Problem Statement:- Check Whether a string s contains only English letters(upper or lowercase).
// Hint:- Regex: ^ [A-Za-z]+$.

package main_java30;
import java.util.regex.*;
public class AlphabetOnlyValidation {
    public static void main(String[] args) {
        String s = "HelloNitish";
        //1.pattern:start(^), letter class[A-Za-z] one or more, end($).
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        //2. matcher for input
        Matcher m = p.matcher(s);
        //3. full-string check
        boolean isAlpha = m.matches();
        System.out.println(isAlpha);
        
    }
}
//Output:- true
// Explanation:-
//. Regex[A-Za-z]+$ matches letters only.
//. Anchors ensure entire string must be letters.
//. matches() returns true for "HelloNitish"
